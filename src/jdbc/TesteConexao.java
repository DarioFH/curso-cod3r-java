package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();

        System.out.println("Deu boas!");

        connection.close();
    }
}
