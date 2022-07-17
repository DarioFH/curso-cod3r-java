package controle.desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int valor = Integer.parseInt(entrada.next());
		
		if(valor >= 0 && valor <= 10) {
			String resp = valor % 2 == 0?"Par":"Ímpar";
			
			System.out.printf("é um número %s", resp);
		}else {
			System.out.println("Ops, número não se encaixa nos padrões");
		}

		entrada.close();
	}
}
