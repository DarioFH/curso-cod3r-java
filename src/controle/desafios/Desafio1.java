package controle.desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int valor = Integer.parseInt(entrada.next());
		
		if(valor >= 0 && valor <= 10) {
			String resp = valor % 2 == 0?"Par":"�mpar";
			
			System.out.printf("� um n�mero %s", resp);
		}else {
			System.out.println("Ops, n�mero n�o se encaixa nos padr�es");
		}

		entrada.close();
	}
}
