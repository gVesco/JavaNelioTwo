package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int tamanhoVetor = scn.nextInt();
		int[] vetor = new int[tamanhoVetor];
		int qtdeNumPares = 0;
		int somaVetorPares = 0;

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scn.nextInt();

			if (vetor[i] % 2 == 0) {
				qtdeNumPares++;
				somaVetorPares += vetor[i];
			}
		}

		if (qtdeNumPares > 0) {
			double mediaPares = somaVetorPares / qtdeNumPares;
			System.out.println("MEDIA DOS PARES = " + mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		scn.close();
	}

}
