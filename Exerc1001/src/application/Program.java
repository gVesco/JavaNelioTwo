package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro positivo N (máximo = 10)
		// depois N números inteiros e armazene-os em um vetor.
		// Em seguida, mostrar na tela todos os números negativos lidos.

		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 10 para que seja gerado uma lista com essa quantidade: ");
		int tamanhoArray = scn.nextInt();
		if (tamanhoArray > 0 && tamanhoArray <= 10) {

			int[] meuArray = new int[tamanhoArray];

			for (int i = 0; i < tamanhoArray; i++) {
				scn.nextLine();
				meuArray[i] = scn.nextInt();
			}

			System.out.println("Os números negativos informados estão listados abaixo:");

			for (int i = 0; i < tamanhoArray; i++) {
				if (meuArray[i] < 0) {
					System.out.println(meuArray[i]);
				}
			}
		}
		else {
			System.out.println("Valor informado inválido, tente novamente...");
			main(args);
		}
		scn.close();
	}

}
