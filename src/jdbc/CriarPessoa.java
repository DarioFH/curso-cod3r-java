package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CriarPessoa {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = entrada.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();

        System.out.println("Pessoa criada com sucesso!");

        entrada.close();
        connection.close();
    }
}
