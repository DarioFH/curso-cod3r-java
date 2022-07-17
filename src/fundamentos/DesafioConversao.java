package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o salário numero 1");
		String s1 = entrada.nextLine();

		System.out.println("Informe o salário numero 2");
		String s2 = entrada.nextLine();

		System.out.println("Informe o salário numero 3");
		String s3 = entrada.nextLine();

		double sConv1 = Double.parseDouble(s1.replace(',', '.'));
		double sConv2 = Double.parseDouble(s2.replace(',', '.'));
		double sConv3 = Double.parseDouble(s3.replace(',', '.'));

		double soma = sConv1 + sConv2 + sConv3;
		double media = soma / 3;

		System.out.printf("A soma dos salários é: R$ %.2f %nE%n", soma);
		System.out.printf("A Média é: R$ %.2f %n", media);

		entrada.close();
	}
}
