package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu")); // aceita duplicado
		lista.add(new Usuario("Januario"));
		
		System.out.println(lista.get(3)); //acessar pelo index // imprimir Bia
		
		System.out.println(">>> "+lista.remove(1)); // remover Carlos
		System.out.println(lista.remove(new Usuario("Manu"))); // remover Manu
		
		System.out.println("Tem? "+lista.contains(new Usuario("Lia"))); // checar se existe a Lia
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
