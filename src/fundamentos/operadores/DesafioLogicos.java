package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na ter�a V || F
		// Trabalho na quinta V || F
		
		boolean trab1 = true;
		boolean trab2 = true;
		
		boolean TV50 = trab1 && trab2;
		boolean TV32 = trab1 ^ trab2;
		boolean Svt = trab1 || trab2;
		
		//Operador Un�rio
		boolean maisSaudavel = !Svt;
		
		System.out.println("Comprou uma TV de 50\"? "+TV50);
		System.out.println("Comprou uma TV de 32\"? "+TV32);
		System.out.println("Tomou Sorvete\"? "+Svt);
		System.out.println("Ficou Saud�vel sem doces\"? "+maisSaudavel);
		
	
	}
}
