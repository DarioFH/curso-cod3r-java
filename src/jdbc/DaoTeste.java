package jdbc;

public class DaoTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "Joãozinho da silva"));
        System.out.println(dao.incluir(sql, "Luizito Soares"));
        System.out.println(dao.incluir(sql, "Jô Suado"));

        dao.close();
    }
}
