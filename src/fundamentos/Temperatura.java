package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		// celsius to fahrenheit
		final int diff = 32;
		final double fatorCelsius = 9 / 5.0 ;
		final double fatorFahrenheit = 5.0 / 9;
		double celsius = 29;
		double fahrenheit = (celsius * fatorCelsius) + diff ;
		
		System.out.println("Celsius: "+celsius+"° = "+fahrenheit+"° Fahrenheit");
		
		
		//fahrenheit to celsius
		fahrenheit = 89;
		celsius = (fahrenheit - diff) * fatorFahrenheit;
		System.out.println("Fahrenheit: "+fahrenheit+"° = "+celsius+"° Celsius");
				
	}
}
