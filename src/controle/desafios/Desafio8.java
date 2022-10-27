package controle.desafios;

import java.util.Scanner;

public class Desafio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Please Inform a Word: ");
		String word_informed = entrada.nextLine();
		
		int word_len = word_informed.length();
		
		for (int i = 0; i < word_len; i++) {
			System.out.println(word_informed.substring(i, i+1));
		}
		
		

		entrada.close();
	}
}
