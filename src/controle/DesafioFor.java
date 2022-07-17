package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//construir um for sem usar números para obter o mesmo resultado do for acima
		
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
		
		
	}
}
