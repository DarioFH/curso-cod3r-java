package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		double notas_validas = 0;
		
		
		while(nota != -1) {
			System.out.println("Informe a nota do Aluno: ");
			nota = Double.parseDouble(entrada.next().replace(',', '.'));
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				notas_validas ++;
			}else if(nota != -1){
				System.out.println("Ops, informe uma nota v�lida!");
			} else {
				System.out.println("Calculando!");
			}
		}
		
		double media = total / notas_validas;
		
		System.out.printf("Notas avaliadas: %.2f, Somat�ria: %.2f, Resultado da M�dia: %.2f", notas_validas, total, media);
		
		

		entrada.close();
	}
}
