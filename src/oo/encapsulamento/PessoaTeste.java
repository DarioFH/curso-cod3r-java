package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Juca", "Bala", 32);

		System.out.println(p1.getIdade());
		System.out.println(p1);
	}
}
