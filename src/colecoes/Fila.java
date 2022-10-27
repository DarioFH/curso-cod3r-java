package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença e o comportamento quando a fila está cheia!
		// Quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo da fila (sem remover)
		// Diferença de comportamento ocorre
		// Quando a fila está vazia
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		// Diferença e o comportamento ocorre
		// quando a fila está vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();		
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
				
	}
}
