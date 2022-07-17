package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(0));
		
		
		String s = "Boa Tarde";
		s = s.toUpperCase();
		s = "Boa Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa boa Tarde"));
		System.out.println(s.equalsIgnoreCase("boa boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalário: R$"+salario+"\n\n");
		
		System.out.printf("O Sr. %s %s \ntem %d anos e o salário de R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\n\nO Sr. %s %s \ntem %d anos e o salário de R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
