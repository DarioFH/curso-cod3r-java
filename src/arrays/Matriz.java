package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos avaliados: ");
		int qtd_alunos = Integer.parseInt(entrada.nextLine());

		System.out.println("Informe a quantidade de notas por aluno: ");
		int qtd_notas = Integer.parseInt(entrada.nextLine());

		if (qtd_alunos > 0 && qtd_notas > 0) {

			double[][] notasDaTurma = new double[qtd_alunos][qtd_notas];
			double total = 0;
			double totalGeral = 0;
			int cont = 0;

			for (int i = 0; i < qtd_alunos; i++) {
				System.out.println("Informe as notas do aluno " + (i + 1) + ": ");
				for (int j = 0; j < qtd_notas; j++) {
					System.out.println("Nota número " + (j + 1) + ": ");
					notasDaTurma[i][j] = Double.parseDouble(entrada.nextLine().replace(',', '.'));
				}
			}

			for (double[] aluno : notasDaTurma) {
				total = 0;
				cont++;
				for (double nota : aluno) {
					total += nota;
					totalGeral += nota;
				}
				System.out.println("A média do aluno " + cont + ": " + (total / qtd_notas));
			}

			System.out.printf("A média geral da sala é de: %.2f", (totalGeral / (qtd_alunos * qtd_notas)));

		} else {
			System.out.println("Números Inseridos tem de ser maior que zero");
		}

		entrada.close();
	}
}
