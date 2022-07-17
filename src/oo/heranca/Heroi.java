package oo.heranca;

public class Heroi extends Jogador{

	public Heroi(int x, int y){
		super(x,y);
	}
	
	public boolean atacar(Jogador oponente) {
		boolean at1 = super.atacar(oponente);
		boolean at2 = super.atacar(oponente);
		boolean at3 = super.atacar(oponente);
		return at1 || at2 || at3 ;
	}
}
