package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);
		Alimento al1 = new Arroz(0.2);
		Alimento al2 = new Feijao(0.1);
		Alimento sobremesa = new Sorvete(0.4);

		convidado.comer(al1);
		convidado.comer(al2);

		System.out.println(convidado.getPeso());

		System.out.println("Sobremesa...");

		convidado.comer(sobremesa);

		System.out.println(convidado.getPeso());

	}
}
