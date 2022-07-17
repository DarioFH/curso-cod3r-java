package fundamentos.desafios;

import java.util.Scanner;

public class DesafioAreaTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a base do tri‚ngulo: ");
		double base = Double.parseDouble(entrada.next().trim().replace(',', '.'));
		System.out.print("Informe a altura do tri‚ngulo: ");
		double altura = Double.parseDouble(entrada.next().trim().replace(',', '.'));
		
		double area = (base*altura) / 2;
		
		System.out.printf("Altura: %.2f \nBase: %.2f \n¡rea: %.2f", altura, base, area);
		
		entrada.close();
	}
}
