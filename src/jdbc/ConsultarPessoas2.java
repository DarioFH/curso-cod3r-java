package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM pessoas WHERE nome like ?";
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(sql);
        Scanner entrada = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Inserida o nome para localizar: ");
        String filtro = entrada.nextLine();

        stmt.setString(1, "%"+filtro+"%");
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo()+" - "+p.getNome());
        }

        entrada.close();
        connection.close();
        stmt.close();
    }
}
