package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int tamanhoVetor = scn.nextInt();
		scn.nextLine(); // Consumir a quebra de linha pendente
		double[] vetor = new double[tamanhoVetor];
		double somaVetor = 0.00;
		double mediaVetor = 0.00;

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scn.nextDouble();
			scn.nextLine(); // Consumir a quebra de linha pendente
			somaVetor += vetor[i];
			mediaVetor = somaVetor / tamanhoVetor;
		}

		System.out.printf("%nMEDIA DO VETOR = %.3f", mediaVetor);
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < tamanhoVetor; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}

		scn.close();
	}
}