package lambdas;

import java.text.DecimalFormat;
//import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = prod -> prod.preco * (1 - prod.desconto);
		
		//BinaryOperator<Double> precoReal = (value, discount) -> value * (1 - discount);
		
		UnaryOperator<Double> calcImposto = value -> value >= 2500 ? (value * (1 + (8.5 / 100))) : value ;
		
		UnaryOperator<Double> calcFrete = value -> value >= 3000 ? (value + 100) : (value + 50) ;
		
		Function<Double, String> resultadoFinal = value -> "R$"+new DecimalFormat("#,##0.00").format(value);
		
		String preco = "O preço final é "+precoReal.andThen(calcImposto).andThen(calcFrete).andThen(resultadoFinal).apply(p);
		
		System.out.println(preco);
	}
}
