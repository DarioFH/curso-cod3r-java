package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = Double.parseDouble(entrada.next().replace(',', '.'));
		
		if(nota <= 10 && nota > 8.5) {
			System.out.println("Parab�ns tirou A");
		} else if (nota <= 8.5 && nota > 6.5) {
			System.out.println("Parab�ns tirou B");
		} else if (nota <= 6.5 && nota > 5) {
			System.out.println("Opa, tirou C, tem que melhorar");
		} else if (nota <= 5 && nota > 3) {
			System.out.println("Que pena, tirou D, est� de Recupera��o!");
		} else if (nota <= 3) {
			System.out.println("SPDI, tirou E, Reprovado");
		}else {
			System.out.println("Nota informada n�o se encaixa no metodo de avalia��o!");
		}
		
		
		
		entrada.close();
	}
}
