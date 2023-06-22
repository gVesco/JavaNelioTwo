package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
			System.out.print("Quantas pessoas serão digitadas? ");
			int qtdePessoas = Integer.parseInt(scn.nextLine());
			Pessoa[] pessoa = new Pessoa[qtdePessoas];
			double altura = 0.0;
			double menorAltura = 0.0;
			double maiorAltura = 0.0;
			double somaAlturaMulheres = 0.0;
			double mediaAlturaMulheres = 0.0;
			int numeroHomens = 0;
			int numeroMulheres = 0;

			for (int i = 0; i < qtdePessoas; i++) {
				System.out.print("Altura da " + (i + 1) + "a pessoa: ");
				altura = Double.parseDouble(scn.nextLine());
				System.out.print("Gênero da " + (i + 1) + "a pessoa (F ou M): ");
				String genero = scn.nextLine();

				if (genero.equalsIgnoreCase("F")) {
					somaAlturaMulheres += altura;
					numeroMulheres++;
				} else if (genero.equalsIgnoreCase("M")) {
					numeroHomens++;
				} else {
					System.out.println("Gênero inválido, a operação será cancelada.");
					break;
				}

				if (altura > maiorAltura) {
					maiorAltura = altura;
				} else if (altura < menorAltura) {
					menorAltura = altura;
				}
				
				if (i == 0 || altura <= 0.0) {
					menorAltura = altura;
				}

				pessoa[i] = new Pessoa(altura, genero);
			}
			if (numeroMulheres > 0) {
				mediaAlturaMulheres = somaAlturaMulheres / numeroMulheres;
			}

			System.out.println("Menor altura = " + menorAltura);
			System.out.println("Maior altura = " + maiorAltura);
			System.out.println("Média das alturas das mulheres = " + mediaAlturaMulheres);
			System.out.println("Número de homens = " + numeroHomens);
		} finally {
			scn.close();
		}
	}

}
