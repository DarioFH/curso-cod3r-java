package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
			case "preta":
				System.out.println("Sei os paranau� da faixa preta");
			case "marrom":
				System.out.println("Sei os paranau� da faixa marrom");
			case "roxa":
				System.out.println("Sei os paranau� da faixa roxa");
			case "verde":
				System.out.println("Sei os paranau� da faixa verde");
			case "laranja":
				System.out.println("Sei os paranau� da faixa laranja");
			case "vermelha":
				System.out.println("Sei os paranau� da faixa vermelha");
			case "amarela":
				System.out.println("Sei os paranau� da faixa amarela");
				break;
			default:
				System.out.println("N�o manjo dos paranau�");
		}
		System.out.println("Fim");	
	}
}
