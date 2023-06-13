package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em
		// seguida:
		// - Imprimir todos os elementos do vetor
		// - Mostrar na tela a soma e a média dos elementos do vetor

		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int tamanhoArray = scn.nextInt();
		if (tamanhoArray > 0) {

			double[] meuArray = new double[tamanhoArray];
			double somaValores = 0.00;
			for (int i = 0; i < tamanhoArray; i++) {
				scn.nextLine();
				System.out.print("Digite um número: ");
				meuArray[i] = scn.nextDouble();
			}

			System.out.printf("%nVALORES =");

			for (int i = 0; i < tamanhoArray; i++) {
				System.out.print("  " + meuArray[i]);
				somaValores += meuArray[i];
			}
			System.out.printf("%nSOMA = %.2f", somaValores);
			System.out.printf("%nMEDIA = %.2f", (somaValores / tamanhoArray));

		} else {
			System.out.println("Valor informado inválido, tente novamente...");
			main(args);
		}

		scn.close();

	}

}
