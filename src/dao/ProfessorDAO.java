package dao;

import bean.Professor;
import conexao.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    private static final String INSERT_SQL = "INSERT INTO Professor (nome, cpf, data_nasc, sexo, codFuncional, areaAtuacao, telefone) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM Professor";
    private static final String UPDATE_SQL = "UPDATE Professor SET nome=?, cpf=?, data_nasc=?, sexo=?, codFuncional=?, areaAtuacao=?, telefone=? WHERE cod=?";
    private static final String DELETE_SQL = "DELETE FROM Professor WHERE cod=?";

    public void gravar(Professor professor) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(INSERT_SQL)) {
            professor.setCpf(professor.getCpf());
            
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getCpf());
            stmt.setDate(3, java.sql.Date.valueOf(professor.getDataNasc()));
            stmt.setString(4, String.valueOf(professor.getSexo()));
            stmt.setInt(5, professor.getCodFuncional());
            stmt.setString(6, professor.getAreaAtuacao());
            stmt.setString(7, professor.getTelefone());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao gravar professor: " + ex.getMessage());
        }
    }

    public List<Professor> consultar() {
        List<Professor> professores = new ArrayList<>();
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(SELECT_SQL);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Professor professor = new Professor();
                professor.setCod(rs.getInt("cod"));
                professor.setNome(rs.getString("nome"));
                professor.setCpf(rs.getString("cpf"));
                professor.setDataNasc(rs.getDate("data_nasc").toLocalDate());
                professor.setSexo(rs.getString("sexo").charAt(0));
                professor.setCodFuncional(rs.getInt("codFuncional"));
                professor.setAreaAtuacao(rs.getString("areaAtuacao"));
                professor.setTelefone(rs.getString("telefone"));
                professores.add(professor);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar professores: " + ex.getMessage());
        }
        return professores;
    }

    public void alterar(Professor professor) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(UPDATE_SQL)) {
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getCpf());
            stmt.setDate(3, java.sql.Date.valueOf(professor.getDataNasc())); 
            stmt.setString(4, String.valueOf(professor.getSexo()));
            stmt.setInt(5, professor.getCodFuncional());
            stmt.setString(6, professor.getAreaAtuacao());
            stmt.setString(7, professor.getTelefone());
            stmt.setInt(8, professor.getCod());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar professor: " + ex.getMessage());
        }
    }

    public void excluir(Professor professor) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(DELETE_SQL)) {
            stmt.setInt(1, professor.getCod());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir professor: " + ex.getMessage());
        }
    }
}