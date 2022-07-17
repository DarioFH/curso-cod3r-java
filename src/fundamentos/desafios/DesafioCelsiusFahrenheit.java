package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os graus em Celsius");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println(fahrenheit);
		
		System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);
		
		
		entrada.close();
	}
}
