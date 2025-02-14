package dao;

import bean.Aluno;
import bean.CpfInvalidoException;
import conexao.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    
    private static final String INSERT_SQL = "INSERT INTO aluno(nome, cpf, data_nasc, telefone, sexo, ra, ira) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM aluno";
    private static final String UPDATE_SQL = "UPDATE aluno SET nome=?, cpf=?, data_nasc=?, telefone=?, sexo=?, ra=?, ira=? WHERE cod=?";
    private static final String DELETE_SQL = "DELETE FROM aluno WHERE cod=?";

    public void gravar(Aluno aluno) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(INSERT_SQL)) {
            aluno.setCpf(aluno.getCpf());

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setDate(3, java.sql.Date.valueOf(aluno.getDataNasc()));
            stmt.setString(4, aluno.getTelefone());
            stmt.setString(5, String.valueOf(aluno.getSexo()));
            stmt.setString(6, aluno.getRa());
            stmt.setFloat(7, aluno.getIra());
            stmt.execute();
        } catch (CpfInvalidoException ex) {
            System.out.println("Erro de CPF inválido: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao gravar aluno: " + ex.getMessage());
        }
    }



    public List<Aluno> consultar() {
        List<Aluno> alunos = new ArrayList<>();
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(SELECT_SQL);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setCod(rs.getInt("cod"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setDataNasc(rs.getDate("data_nasc").toLocalDate()); 
                aluno.setSexo(rs.getString("sexo").charAt(0));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setRa(rs.getString("ra"));
                aluno.setIra(rs.getFloat("ira"));
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar alunos: " + ex.getMessage());
        }
        return alunos;
    }

    public void alterar(Aluno aluno) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(UPDATE_SQL)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setDate(3, java.sql.Date.valueOf(aluno.getDataNasc())); 
            stmt.setString(4, aluno.getTelefone());
            stmt.setString(5, String.valueOf(aluno.getSexo()));
            stmt.setString(6, aluno.getRa());
            stmt.setFloat(7, aluno.getIra());
            stmt.setInt(8, aluno.getCod());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar aluno: " + ex.getMessage());
        }
    }

    public void excluir(Aluno aluno) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(DELETE_SQL)) {
            stmt.setInt(1, aluno.getCod());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir aluno: " + ex.getMessage());
        }
    }
}