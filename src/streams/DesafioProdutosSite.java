package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioProdutosSite {

	public static void main(String[] args) {
		
		ProdutosSiteDesafio prod1 = new ProdutosSiteDesafio("Notebook Gamer", 7999.00, 35.00, false);
		ProdutosSiteDesafio prod2 = new ProdutosSiteDesafio("Ar Condicionado", 1999.00, 15.00, true);
		ProdutosSiteDesafio prod3 = new ProdutosSiteDesafio("Monitor Ultrawide", 1299.00, 30.00, true);
		ProdutosSiteDesafio prod4 = new ProdutosSiteDesafio("Carrinho de Controle Remoto", 299.00, 50.00, true);
		ProdutosSiteDesafio prod5 = new ProdutosSiteDesafio("Smart Watch", 4999.00, 12.00, true);
		ProdutosSiteDesafio prod6 = new ProdutosSiteDesafio("Cadeira Gamer", 7999.00, 35.00, false);
		
		List<ProdutosSiteDesafio> prods = Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6);
		
		Predicate<ProdutosSiteDesafio> descontoBom = a -> a.desconto >= 30;
		Predicate<ProdutosSiteDesafio> freteGratis = a -> a.freteGratis;
		Function<ProdutosSiteDesafio, String> descItem = 
					a -> "MEGA PROMOÇÃO: "+
					a.nome+" - Preço final: R$"+
					a.precoFinal.toString().replace(".", ",")+
					" FRETE GRÁTIS!!!";
					
		prods.stream()
				.filter(descontoBom)
				.filter(freteGratis)
				.map(descItem)
				.forEach(System.out::println);
	}
}
