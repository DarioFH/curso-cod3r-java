package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost:3306";
        final String user = "root";
        final String pass = "";

        Connection connection = DriverManager.getConnection(url, user, pass);

        Statement stmt = connection.createStatement();

        stmt.execute("CREATE DATABASE curso_java");


        connection.close();
    }
}
