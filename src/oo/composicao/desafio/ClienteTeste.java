package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Astolfinho");
		Compra comp1 = new Compra(cli1);
		Compra comp2 = new Compra(cli1);
		
		//lista de produtos
		Produto p1 = new Produto("Lapis", 0.5);
		Produto p2 = new Produto("Caneta", 0.8);
		Produto p3 = new Produto("Borracha", 1.00);
		Produto p4 = new Produto("Apontador", 1.20);
		Produto p5 = new Produto("Lapiseira", 1.50);
		
		
		//lista de itens (produto + quantidade)
		Item i1 = new Item(p1, 4); // val total 2
		Item i2 = new Item(p3, 3); // val total 3
		Item i3 = new Item(p4, 1); // val total 1.2
		
		Item i4 = new Item(p2, 2); // val total 1.6
		Item i5 = new Item(p5, 1); // val total 1.5
		
		
		//adicionando as compras
		comp1.itens.add(i1);
		comp1.itens.add(i2);
		comp1.itens.add(i3);
		
		comp2.itens.add(i4);
		comp2.itens.add(i5);
		
		
		System.out.println(comp1.obterValorTotal());
		System.out.println(comp2.obterValorTotal());
		cli1.compras.add(comp1);
		cli1.compras.add(comp2);
		
		System.out.println(cli1.nome.toString()+" Gastou um total de: ");
		System.out.println(cli1.obterValorTotal());
		
		
	}
}
