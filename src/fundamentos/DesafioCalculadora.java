package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler numero 1
		// Ler numero 2
		// + - * / %
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		String n1 = entrada.next();
		System.out.println("Digite o segundo número: ");
		String n2 = entrada.next();
		
		double val1 = Double.parseDouble(n1.replace(',', '.'));
		double val2 = Double.parseDouble(n2.replace(',', '.'));
				
		System.out.println("Informe qual a operação desejada ( +, -, *, / ou %)");
		String op = entrada.next().toString();
		
		double result = (op.equals("+")) ? (val1 + val2) : 
						(op.equals("-")) ? (val1 - val2) : 
						(op.equals("*")) ? (val1 * val2) : 
						(op.equals("/")) ? (val1 / val2) : 
						(op.equals("%")) ? (val1 % val2) : 
						0;
		
		System.out.printf("%.2f %s %.2f = %.2f",val1, op, val2, result);
		
		entrada.close();
	}
}
