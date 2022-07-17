package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ol�, informe a quantidade de notas que ir� inserir: ");
		int qtd_notas = Integer.parseInt(entrada.nextLine());

		if (qtd_notas > 0) {

			double[] notas = new double[qtd_notas];
			double total = 0;
			double media = 0;

			for (int i = 0; i < qtd_notas; i++) {
				System.out.printf("Insira a %d nota: %n", (i + 1));
				notas[i] = Double.parseDouble(entrada.nextLine().replace(',', '.'));
			}

			System.out.println("Calculando a média...");

			for (double nota : notas) {
				total += nota;
			}
			media = total / notas.length;
			System.out.printf("Total de notas: %d%nSoma das notas: %.2f%nM�dia final: %.2f", qtd_notas, total, media);

		} else {
			System.out.println("O n�mero informado deve ser maior que 0");
		}
		entrada.close();
	}

}