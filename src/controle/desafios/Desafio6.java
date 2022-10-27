package controle.desafios;

import java.util.Scanner;

public class Desafio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numb_rand = (int) (Math.random() * 100) + 0;
		int numb_chances = 10;
		//System.out.println("informe o numero de tentativas que vc quer");
		//int numb_chances = Integer.parseInt(entrada.nextLine());
		int palpite = 0;
		System.out.println("Vamos Iniciar o Jogo!");

		for (int i = 1; i <= numb_chances; i++) {
			System.out.println("Informe o seu palpite: ");
			palpite = Integer.parseInt(entrada.nextLine());

			if (palpite == numb_rand) {
				System.out.println("Show, vc acertou na " + i + " tentativa(s)");
				break;
			} else {
				if (numb_chances - i != 0) {
					System.out.println("Que pena, vc errou, mas ainda tem " + (numb_chances - i) + " chances");
					System.out.println(palpite < numb_rand ? "O n�mero que vc informou é menor do que o correto"
							: "O n�mero que vc informou � maior do que o correto!");
				}
			}
		}

		System.out.println(palpite == numb_rand ? "Parabéns, vc ganhou o jogo" : "Ops Fim de Jogo, mais sorte na próxima!");
		entrada.close();
	}
}
