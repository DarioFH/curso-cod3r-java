package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data(8,10,1990);
		Data d2 = new Data();
		
		d1.dia = 8;
		d1.mes = 10;
		d1.ano = 1990;
		
		
		System.out.println("As Datas informadas foram: ");
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
