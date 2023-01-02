package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306?useSSL=false";
        final String user = "root";
        final String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);

        System.out.println("Deu boas!");

        connection.close();
    }
}
