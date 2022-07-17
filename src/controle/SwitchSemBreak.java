package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
			case "preta":
				System.out.println("Sei os paranauê da faixa preta");
			case "marrom":
				System.out.println("Sei os paranauê da faixa marrom");
			case "roxa":
				System.out.println("Sei os paranauê da faixa roxa");
			case "verde":
				System.out.println("Sei os paranauê da faixa verde");
			case "laranja":
				System.out.println("Sei os paranauê da faixa laranja");
			case "vermelha":
				System.out.println("Sei os paranauê da faixa vermelha");
			case "amarela":
				System.out.println("Sei os paranauê da faixa amarela");
				break;
			default:
				System.out.println("Não manjo dos paranauê");
		}
		System.out.println("Fim");	
	}
}
