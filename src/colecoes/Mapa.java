package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println("Contém Rebeca: "+usuarios.containsValue("Rebeca"));
		
		System.out.println("Pegando registro: "+usuarios.get(4));
		System.out.println("Removendo chave 1:"+usuarios.remove(1));
		System.out.println("Removendo por chave ou valor: "+usuarios.remove(2, "Ricardo"));
		
		
		System.out.println("---PKey---");
		//foreach por chave
		for(Integer chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("---PValue---");
		//foreach por valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("---PObject---");
		//foreach por valor
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey()+" - "+registro.getValue());
		}
	}
}
