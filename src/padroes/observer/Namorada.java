package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

    @Override
    public void chegou(EventoChegadaAniversariante e) {
        System.out.println("Avisar os convidados");
        System.out.println("Apagar as Luzes");
        System.out.println("Esperar um pouco");
        System.out.println("e... Surpresa!!!");
    }
}
