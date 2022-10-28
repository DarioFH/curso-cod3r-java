package generics;

public class ParesTeste {

    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Gui");
        resultadoConcurso.adicionar(4, "Ana");
        resultadoConcurso.adicionar(5, "Braga");
        resultadoConcurso.adicionar(6, "Louro");
        resultadoConcurso.adicionar(7, "José");
        resultadoConcurso.adicionar(2, "Joaquina");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(4));


    }
}
