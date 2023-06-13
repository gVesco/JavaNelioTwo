package entities;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Dados da" + "a pessoa"
				+ "Nome: "
				+ nome 
				+ "Idade: " 
				+ idade 
				+ "Altura: " 
				+ String.format("%.2f", altura);
	}

}
