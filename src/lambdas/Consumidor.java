package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome+"!!!");
		
		Produto p1 = new Produto("Caneta", 2.59, 0.15);
		Produto p2 = new Produto("Lapis", 1.5, 0.15);
		Produto p3 = new Produto("Lapiseira", 3.99, 0.15);
		Produto p4 = new Produto("Borracha", 2.99, 0.15);
		Produto p5 = new Produto("Notebook", 2987.99, 0.25);
		
		imprimir.accept(p1);
		
		List<Produto> prods = Arrays.asList(p1,p2,p3,p4,p5);
		
		prods.forEach(imprimir);
		prods.forEach(p -> System.out.println(p.preco));
		prods.forEach(System.out::println);
	}
}
