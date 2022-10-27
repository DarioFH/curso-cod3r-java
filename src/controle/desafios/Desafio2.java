package controle.desafios;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o ano: ");
		int ano = Integer.parseInt(entrada.next());
		
		String bissexto = ano % 4 == 0?"Bissexto":"Não Bissexto";
		
		System.out.println(bissexto);

		entrada.close();
	}
}
