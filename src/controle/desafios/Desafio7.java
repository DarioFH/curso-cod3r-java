package controle.desafios;

import java.util.Scanner;

public class Desafio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int n = 0;
		
		do {
			System.out.println("Informe um número: ");
			n = Integer.parseInt(entrada.nextLine());
			
			if(n >= 0) {
				soma += n;
			}
			
			System.out.println("A soma dos números Informados é: "+soma);
		} while (n >= 0);
		
		System.out.println("**************FIM******************");
		

		entrada.close();
	}
}
