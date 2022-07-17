package fundamentos.desafios;

import java.util.Scanner;

public class DesafioPotencias {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número para ser calculado: ");
		Double numero = entrada.nextDouble();
		
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		
		System.out.printf("Informado: %.2f \nQuadrado: %.2f \nCubo: %.2f", numero, quadrado, cubo);
		
		
		entrada.close();
	}
}
