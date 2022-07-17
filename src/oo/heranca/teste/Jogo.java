package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador heroi = new Heroi(10, 10);
		
		Jogador monstro = new Monstro(10, 11);
		
		System.out.println("O monstro tem => " + monstro.vida);
		System.out.println("O Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("O monstro tem => " + monstro.vida);
		System.out.println("O Heroi tem => " + heroi.vida);
		
	}
}
