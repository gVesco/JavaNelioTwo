package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int tamanhoVetor = scn.nextInt();
		scn.nextLine(); // Consumir a quebra de linha pendente
		int[] vetorA = new int[tamanhoVetor];
		int[] vetorB = new int[tamanhoVetor];
		int[] vetorC = new int[tamanhoVetor];

		System.out.print("Digite os valores do vetor A: \n");
		for (int i = 0; i < tamanhoVetor; i++) {
			vetorA[i] = scn.nextInt();
			scn.nextLine(); // Consumir a quebra de linha pendente
		}

		System.out.print("Digite os valores do vetor B: \n");
		for (int i = 0; i < tamanhoVetor; i++) {
			vetorB[i] = scn.nextInt();
			scn.nextLine(); // Consumir a quebra de linha pendente
		}

		System.out.println("VETOR RESULTANTE:");

		vetorC = somaVetores(tamanhoVetor, vetorA, vetorB);
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println(vetorC[i]);
		}
		
		scn.close();
	}

	public static int[] somaVetores(int tamanhoVetor, int[] vetorA, int[] vetorB) {
		int[] vetorC = new int[tamanhoVetor];
		for (int i = 0; i < tamanhoVetor; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		return vetorC;
	}
}
