package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//
		Set<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String cadidato: listaAprovados ) {
			System.out.println(cadidato);
		}

		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(12);
		nums.add(156);
		nums.add(121);
		nums.add(13);
		nums.add(8);
		
		// nums.get(1); Não é possivel acessar pelo index
		
		for(Integer num: nums ) {
			System.out.println(num);
		}
	}
}
