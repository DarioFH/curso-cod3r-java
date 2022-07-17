package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome do dia da semana: ");
		String valor = entrada.next().toLowerCase();
		
		if(valor.equals("domingo")) {
			System.out.println(1);
		}else if (valor.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}else if (valor.equalsIgnoreCase("ter�a")) {
			System.out.println(3);
		}else if (valor.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}else if (valor.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}else if (valor.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if (valor.equalsIgnoreCase("s�bado")) {
			System.out.println(7);
		}else {
			System.out.println("Ops, n�o reconhecido");
		}
		
		entrada.close();
	}
}
