package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	Double obterValorTotal() {
		double val_total = 0.00;
		double val = 0;
		for(Compra compra: compras) {
			val = compra.obterValorTotal();
			val_total += val;
		}
		return val_total;
	}
}
