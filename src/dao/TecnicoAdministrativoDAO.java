package dao;

import bean.TecnicoAdministrativo;
import conexao.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TecnicoAdministrativoDAO {

    private static final String INSERT_SQL = "INSERT INTO TecnicoAdministrativo (nome, codFuncional, cpf, telefone, sexo, departamento, data_nasc) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM TecnicoAdministrativo";
    private static final String UPDATE_SQL = "UPDATE TecnicoAdministrativo SET nome=?, codFuncional=?, cpf=?, telefone=?, sexo=?, departamento=?, data_nasc=? WHERE cod=?";
    private static final String DELETE_SQL = "DELETE FROM TecnicoAdministrativo WHERE cod=?";

    public void gravar(TecnicoAdministrativo tecAd) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(INSERT_SQL)) {
            tecAd.setCpf(tecAd.getCpf());
            
            stmt.setString(1, tecAd.getNome());
            stmt.setInt(2, tecAd.getCodFuncional());
            stmt.setString(3, tecAd.getCpf());
            stmt.setString(4, tecAd.getTelefone());
            stmt.setString(5, String.valueOf(tecAd.getSexo()));
            stmt.setString(6, tecAd.getDepartamento());
            stmt.setDate(7, java.sql.Date.valueOf(tecAd.getDataNasc()));
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao gravar técnico administrativo: " + ex.getMessage());
        }
    }

    public List<TecnicoAdministrativo> consultar() {
        List<TecnicoAdministrativo> tecAdList = new ArrayList<>();
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(SELECT_SQL);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                TecnicoAdministrativo tecAd = new TecnicoAdministrativo();
                tecAd.setCod(rs.getInt("cod"));
                tecAd.setNome(rs.getString("nome"));
                tecAd.setCpf(rs.getString("cpf"));
                tecAd.setDataNasc(rs.getDate("data_nasc").toLocalDate()); 
                tecAd.setSexo(rs.getString("sexo").charAt(0));
                tecAd.setCodFuncional(rs.getInt("codFuncional"));
                tecAd.setDepartamento(rs.getString("departamento"));
                tecAd.setTelefone(rs.getString("telefone"));
                tecAdList.add(tecAd);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar técnicos administrativos: " + ex.getMessage());
        }
        return tecAdList;
    }

    
    public void alterar(TecnicoAdministrativo tecAd) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(UPDATE_SQL)) {
            stmt.setString(1, tecAd.getNome());
            stmt.setInt(2, tecAd.getCodFuncional());
            stmt.setString(3, tecAd.getCpf());
            stmt.setString(4, tecAd.getTelefone());
            stmt.setString(5, String.valueOf(tecAd.getSexo()));
            stmt.setString(6, tecAd.getDepartamento());
            stmt.setDate(7, java.sql.Date.valueOf(tecAd.getDataNasc()));
            stmt.setInt(8, tecAd.getCod());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar técnico administrativo: " + ex.getMessage());
        }
    }

    
    public void excluir(TecnicoAdministrativo tecAd) {
        try (PreparedStatement stmt = BancoDados.getInstance().prepareStatement(DELETE_SQL)) {
            stmt.setInt(1, tecAd.getCod());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir técnico administrativo: " + ex.getMessage());
        }
    }
}