package entities;

public class Funcionario {
	private int idFunc = 0;
	private double salarioFunc = 0.0;
	private String nomeFunc = "";

	public Funcionario(int idFunc, double salarioFunc, String nomeFunc) {
		this.idFunc = idFunc;
		this.salarioFunc = salarioFunc;
		this.nomeFunc = nomeFunc;
	}

	public void aumentarSalario(double percAumento) {
		double aumento = salarioFunc * percAumento / 100;
		salarioFunc += aumento;
	}

	public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public double getSalarioFunc() {
		return salarioFunc;
	}

	public String toString() {
		return String.format(idFunc + ", " + nomeFunc + ", " + salarioFunc);
	}
}
