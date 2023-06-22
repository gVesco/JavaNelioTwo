package entities;

public class QuartosDisp {
	private int numQuartoAlugado;
	private String nome;
	private String email;

	public QuartosDisp(int numQuartoAlugado, String nome, String email) {
		this.numQuartoAlugado = numQuartoAlugado;
		this.nome = nome;
		this.email = email;
	}

	public int getNumQuartoAlugado() {
		return numQuartoAlugado;
	}

	public void setNumQuartoAlugadoo(int numQuartoAlugado) {
		this.numQuartoAlugado = numQuartoAlugado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return String.format(numQuartoAlugado + ": " + nome + ", " + email);

	};

}
