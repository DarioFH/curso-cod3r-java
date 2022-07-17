package oo.heranca.desafio;

public class Carro {

	protected final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	private int delta = 5;
	


	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		int nvel = velocidadeAtual - 5;
		
		if(nvel < 0) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual = nvel;
		}
	}
	
	
	@Override
	public String toString() {
		return "Velocidade Atual é "+velocidadeAtual+"Km/h.";
	}

	
	public int getDelta() {
		return delta;
	}
	
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
}
