package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		//Consumer<Integer> prinln = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLang = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLang).forEach(print);
		Arrays.stream(maisLang).forEach(print);
		Arrays.stream(maisLang,1,3).forEach(print);
		
		List<String> outrasLang = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLang.stream().forEach(print);
		outrasLang.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n + 1).forEach(prinln);
	}
}
