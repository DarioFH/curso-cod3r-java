package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<Item>();
	Cliente cliente;
	
	Compra(Cliente cliente){
		this.cliente = cliente;
	}
	
	Double obterValorTotal() {
		double val_total = 0.00;
		for(Item item: itens) {
			val_total += (item.qtd * item.produto.preco);
		}
		return val_total;
	}

}
