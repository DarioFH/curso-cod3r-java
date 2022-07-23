package streams;

public class ProdutosSiteDesafio {

	final String nome;
	final Double preco;
	final Double desconto;
	final Boolean freteGratis;
	final Double precoFinal;
	
	
	public ProdutosSiteDesafio(String nome, Double preco, Double desconto, Boolean freteGratis) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
		this.precoFinal = setPrecoFinal();
	}
	
	private Double setPrecoFinal() {
		return preco - (preco * (desconto/100));
	}
}
