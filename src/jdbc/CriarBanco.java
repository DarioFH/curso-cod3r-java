package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        Statement stmt = connection.createStatement();

        stmt.execute("CREATE DATABASE curso_java");


        connection.close();
    }
}
