package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		//double a = 2.3;
		String s = "Bom Dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		
		String y = "Aoba Terezinha";
		
		System.out.println(
				y
				.toLowerCase()
				.replace("aoba", "AOOOBA")
		);
	}
}
