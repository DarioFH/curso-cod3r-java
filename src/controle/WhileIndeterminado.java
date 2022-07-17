package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String resp = "";
		
		while(!resp.equalsIgnoreCase("sair")) {
			System.out.println(resp);
			System.out.println("Digite palavras: ");
			resp = entrada.next();
		}
		
		
		
		
		entrada.close();
	}
}
