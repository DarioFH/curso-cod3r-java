package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Consumer<Integer> print = System.out::println;
		
		Function<Integer, String> intToBin = n -> Integer.toBinaryString(n);
		UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> deVoltaParaInt = n -> Integer.parseInt(n, 2);
		
		nums.stream()
			.map(intToBin) // ou .map(Integer::toBinaryString) //
			.map(inverter)
			.map(deVoltaParaInt)
			.forEach(print);
		
		
	}
}
