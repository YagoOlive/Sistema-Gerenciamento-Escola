package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {
    
    private static Connection BancoDados = null;
    
    private String fonte = "NOME-DB";   
	
	
    
    public BancoDados() {
        try {
            //Driver para fazer conexao com um Banco MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            //comando para fazer conexao via JDBC com um banco mysql
            //sendo informado o servidor 
            // + o nome da base de dados, o usuario e a senha.
            BancoDados = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + fonte+"?useTimezone=true&serverTimezone=UTC", "USUARIO-DB", "SENHA-USUARIO");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro de classe nao encontrada!!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro na conexao com o banco de dados!!!");
        }
    }

    public static Connection getInstance() {
        if (BancoDados == null) {
            new BancoDados();
        }
        return BancoDados;
    }

}
