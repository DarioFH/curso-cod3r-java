package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		ProdutosDesafio prod1 = new ProdutosDesafio("Notebook", 2999.99, 9.0, 5);
		ProdutosDesafio prod2 = new ProdutosDesafio("Fonte", 	89.99, 	32.0, 5);
		ProdutosDesafio prod3 = new ProdutosDesafio("Teclado", 	699.99, 15.0, 9);
		ProdutosDesafio prod4 = new ProdutosDesafio("Mouse", 	399.99, 15.0, 7);
		ProdutosDesafio prod5 = new ProdutosDesafio("Headset", 	799.99, 10.0, 6);
		
		List<ProdutosDesafio> prods = Arrays.asList(prod1, prod2, prod3, prod4, prod5);
		
		Predicate<ProdutosDesafio> lucroAlto = a -> a.lucro > 10;
		Predicate<ProdutosDesafio> estoqueBom = a -> a.estoque > 3;
		Function<ProdutosDesafio, String> itemApto = a -> 
								a.nome+" - Preço: R$"+ 
								a.preco.toString().replace(".", ",")+ " - Porcentagem de lucro: "+
								a.lucro+ " - Estoque: "+
								a.estoque ;
		
		System.out.println("Lista de itens com Lucro alto e estoque bom:\n\n");
		prods.stream()
				.filter(lucroAlto)
				.filter(estoqueBom)
				.map(itemApto)
				.forEach(System.out::println);
		
	}
}
