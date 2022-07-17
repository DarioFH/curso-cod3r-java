package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {

		// numerador numerador 1 (esq -> dir)
		Integer numerador_2 = (int) Math.pow((6 * (3 + 2)), 2);
		Integer denominador_1_1 = 3*2;
		Integer num1 = numerador_2 / denominador_1_1;

		// numerador numerador 2 (esq -> dir)
		Integer numerador_res2 = ((1 - 5) * (2 - 7)) / 2;
		Integer num2 = (int) Math.pow(numerador_res2, 2);
		
		//numerador geral
		Integer numerador_geral = (int) Math.pow((num1 - num2),3);
		
		//denominador geral
		Integer denominador_geral = (int) Math.pow(10, 3);
		
		//resultado final
		
		Integer resultado_final = numerador_geral / denominador_geral;

		System.out.println(resultado_final);
	}
}
