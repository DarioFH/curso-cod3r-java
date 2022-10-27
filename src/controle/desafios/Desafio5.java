package controle.desafios;

import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contDivisores = 0;
		System.out.println("Informe o número: ");
		int n = Integer.parseInt(entrada.nextLine());
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				contDivisores++;
			}
		}
		
		
		
		switch(contDivisores) {
		case 0:
			System.out.println("Número: "+n+" é primo!");
			break;
		default:
			System.out.println("Número: "+n+" não é primo!");
		}
		

		entrada.close();
	}
}
