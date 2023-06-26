package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		try {

			System.out.println("Digite dois números inteiros para indicar quantidade de linhas e colunas da matriz:");
			System.out.print("Quantidade de linhas: ");
			int qtdeLinhas = Integer.parseInt(scn.nextLine());
			System.out.print("Quantidade de colunas: ");
			int qtdeColunas = Integer.parseInt(scn.nextLine());
			
			int[][] matriz = new int[qtdeLinhas][qtdeColunas];

			for (int i = 0; i < qtdeLinhas; i++) {
				for (int j = 0; j < qtdeColunas; j++) {
					System.out.print("Posição " + i + "," + j + ": ");
					matriz[i][j] = Integer.parseInt(scn.nextLine());
				}
			}

			System.out.println("Insira um número para que ele seja localizado na matriz: ");
			int numProcurar = scn.nextInt();

			for (int i = 0; i < qtdeLinhas; i++) {
				for (int j = 0; j < qtdeColunas; j++) {
					if (matriz[i][j] == numProcurar) {
						System.out.println("\nPosição " + i + "," + j + ":");
						// temEsquerda ?
						if (j > 0) {
							System.out.println("Esquerda: " + matriz[i][j - 1]);
						}

						// temDireita ?
						if (j < matriz[i].length - 1) {
							System.out.println("Direita: " + matriz[i][j + 1]);
						}

						// temAcima ?
						if (i > 0) {
							System.out.println("Acima: " + matriz[i - 1][j]);
						}

						// temAbaixo ?
						if (i < matriz.length - 1) {
							System.out.println("Abaixo: " + matriz[i + 1][j]);
						}
					}
				}
			}

			System.out.print("\nMatriz completa:");
			
			for (int i = 0; i < qtdeLinhas; i++) {
				System.out.println("");
				for (int j = 0; j < qtdeColunas; j++) {
					System.out.print(matriz[i][j] + " ");
				}
			}

		} finally {
			scn.close();
		}
	}
}
