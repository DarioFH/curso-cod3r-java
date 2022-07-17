package fundamentos.desafios;

import java.util.Scanner;

public class DesafioFahrenheitCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os graus em Fahrenheit");
		double fahrenheit = entrada.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println(celsius);
		
		System.out.printf("%.2f° Fahrenheit equivalem a %.2f° em Celsius", fahrenheit, celsius);
		
		
		entrada.close();
	}
}
