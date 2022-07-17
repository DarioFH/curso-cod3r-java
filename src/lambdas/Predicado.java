package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 1200;
		
		Produto prod1 = new Produto("Televisao", 2999.00, 0.15);
		
		System.out.println(isCaro.test(prod1));
	}
}
