package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Teste {

	public static void main(String[] args) {
		
		Fusca fu1 = new Fusca(150);
		Ferrari fe1 = new Ferrari(450);
		
		
		System.out.println(fu1);
		System.out.println(fe1);
		
		System.out.println("acelerando 15 vezes");
		System.out.println(fe1.velocidadeDoAr());
		fe1.ligarTurbo();
		
		for (int i = 0; i < 15; i++) {
			fu1.acelerar();
			fe1.acelerar();
		}
		System.out.println(fu1);
		System.out.println(fe1);
		System.out.println("freiando 4 vezes");

		for (int i = 0; i < 4; i++) {
			fu1.frear();
			fe1.frear();
		}
		
		System.out.println(fu1);
		System.out.println(fe1);
	}
}