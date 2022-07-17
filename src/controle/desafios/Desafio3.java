package controle.desafios;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a primeira nota: ");
		float n1 = Float.parseFloat(entrada.nextLine());
		System.out.println("Insira a segunda nota: ");
		float n2 = Float.parseFloat(entrada.nextLine());
		
		float media = (n1+n2)/2;
		System.out.println(media);
		if(media >= 7) {
			System.out.println("Aprovado!");
		}else if(media >= 4) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado!");
		}
		
		

		entrada.close();
	}
}
