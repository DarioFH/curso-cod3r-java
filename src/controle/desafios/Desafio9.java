package controle.desafios;

import java.util.Scanner;

public class Desafio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n_flutuante = 0;
		int maior = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" - Insira o n�mero: ");
			n_flutuante = Integer.parseInt(entrada.nextLine());
			if(n_flutuante > maior) {
				maior = n_flutuante;
			}
		}
		
		System.out.println("O maior n�mero informado foi: "+maior);

		entrada.close();
	}
}
