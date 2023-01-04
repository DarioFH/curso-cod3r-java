package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    public static Connection getConexao() {
        final String url = "jdbc:mysql://localhost:3306/curso_java";
        final String user = "root";
        final String pass = "";

        try{
            return DriverManager.getConnection(url, user, pass);
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
