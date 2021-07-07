package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "senai";
    private static final String URL = "jdbc:postgresql://localhost:5432/fastfeet";
    private static Connection conexao = null;
    
    public static Connection criarConexao(){
        if (conexao == null){
            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
                System.out.println("CONECTED");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("NOT CONECTED");
            }
        }
        return conexao;
    }
}
