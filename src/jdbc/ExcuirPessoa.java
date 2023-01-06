package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcuirPessoa {
    public static void main(String[] args) throws SQLException {
        //definicao de e instaciamento base
        String sql = "SELECT * FROM pessoas WHERE nome like ?";
        String sql_del = "DELETE FROM pessoas WHERE codigo = ?";
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(sql);
        PreparedStatement stmt_del = connection.prepareStatement(sql_del);
        List<Pessoa> pessoas = new ArrayList<>();

        //manipulacao e interacao com usuario
        System.out.print("Informe um nome para localizar a pessoa: ");
        String filtro = entrada.nextLine();
        stmt.setString(1, "%"+filtro+"%");
        ResultSet lista_pessoas = stmt.executeQuery();

        while(lista_pessoas.next()){
            int codigo = lista_pessoas.getInt("codigo");
            String nome = lista_pessoas.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo()+" - "+p.getNome());
        }

        System.out.print("Informe o codigo para ser exlcuído permanentemente: ");
        int codigo_del = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Atenção, tem certeza que deseja excluir a Pessoa de código "+codigo_del+"\n1 - Sim\n2- Não");
        int resp_del = entrada.nextInt();

        if(resp_del == 1){
            stmt_del.setInt(1, codigo_del);
            int rows_deleted =  stmt_del.executeUpdate();
            if(rows_deleted > 0) {
                System.out.println(rows_deleted == 1? "Um total de "+rows_deleted+" foi excluída!":"Um total de "+rows_deleted+" foram excluídas");
            }else{
                System.out.println("Nenhuma Pessoa foi Excluída!");
            }
        }else{
            System.out.println("Operação Abortada!");
        }
    }
}
