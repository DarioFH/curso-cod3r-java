package fundamentos.desafios;

import java.util.Scanner;

public class DesafioIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a sua altura em metros: ");
		double altura = Double.parseDouble(entrada.next().replace(',', '.'));
		System.out.print("Informe o seu peso em kg: ");
		double peso = Double.parseDouble(entrada.next().replace(',', '.'));
		
		double IMC = peso / (Math.pow(altura,2));
		
		System.out.printf("Altura: %.2f \nPeso: %.2f \nIMC: %.2f", altura, peso, IMC);
		
		entrada.close();
	}
}
