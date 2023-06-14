package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int qtdeNumeros = scn.nextInt();
		int qtdePares = 0;
		int[] numeros = new int[qtdeNumeros];
		scn.nextLine(); // Consumir a quebra de linha pendente
		
		for (int i = 0; i < qtdeNumeros; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scn.nextInt();
			scn.nextLine(); // Consumir a quebra de linha pendente
		}
		
		System.out.printf("%nNUMEROS PARES:%n");
		
		for (int i = 0; i < qtdeNumeros; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "  ");
				qtdePares++;
			}	
		}

		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdePares);
		
		scn.close();
	}
}
