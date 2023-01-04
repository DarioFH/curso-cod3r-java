package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioUpdate {
    public static void main(String[] args) throws SQLException {

        //preparacao
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome like ?";
        String sqlupdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt_consulta = connection.prepareStatement(sql);
        List<Pessoa> pessoas = new ArrayList<>();

        //tratamentos e interacao
        System.out.print("Insira o nome para buscar: ");
        String filtro = entrada.nextLine();
        stmt_consulta.setString(1, "%"+filtro+"%");
        ResultSet lista_pessoas = stmt_consulta.executeQuery();

        while(lista_pessoas.next()){
            int codigo = lista_pessoas.getInt("codigo");
            String nome = lista_pessoas.getString("nome");
            pessoas.add(new Pessoa(codigo , nome));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo()+" - "+p.getNome());
        }

        System.out.println("\n");
        System.out.println("Digite o número do código que deseja atualizar:");
        int cod_to_update = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Agora digite o novo nome: ");
        String nome_to_update = entrada.nextLine();

        PreparedStatement stmt_update = connection.prepareStatement(sqlupdate);
        stmt_update.setString(1, nome_to_update);
        stmt_update.setInt(2, cod_to_update);
        stmt_update.execute();

        stmt_update.close();
        stmt_consulta.close();
        connection.close();
        entrada.close();
    }
}
