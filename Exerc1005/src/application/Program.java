package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int qtdeNumeros = scn.nextInt();
		int posicaoMaiorNum = 0;
		double numeroMaior = 0.00;
		double[] numeros = new double[qtdeNumeros];
		scn.nextLine(); // Consumir a quebra de linha pendente

		for (int i = 0; i < qtdeNumeros; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scn.nextDouble();
			scn.nextLine(); // Consumir a quebra de linha pendente
			if (numeros[i] > numeroMaior) {
				numeroMaior = numeros[i];
				posicaoMaiorNum = i;
			}
		}

		System.out.printf("%nMAIOR VALOR = %.2f%n", numeroMaior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorNum);
		
		scn.close();
	}
}
