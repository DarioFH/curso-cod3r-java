package excecao;

import java.util.Objects;

public class Aluno {

	public final String nome;
	public final Double nota;
	public final boolean bomComportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	
	public String toString() {
		return "Aluno: "+nome+" Nota: "+nota;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(nota, other.nota);
	}
	
	
}
