package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante o) {
        observadores.add(o);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou? ");
            valor = entrada.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                observadores.forEach(e -> e.chegou(evento));
                valor = "sair";
            }else{
                System.out.println("Alarme Falso!");
            }
        }

        entrada.close();
    }


}
