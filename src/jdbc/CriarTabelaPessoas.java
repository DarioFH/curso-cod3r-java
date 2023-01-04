package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) {
        Connection connection = FabricaConexao.getConexao();
        String sql = "CREATE TABLE pessoas (" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ")";
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso!");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
