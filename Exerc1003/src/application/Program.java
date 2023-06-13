package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int qtdePessoas = scn.nextInt();
		
		for (int i = 0; i < qtdePessoas; i++) {
			scn.nextLine();
			System.out.println("Dados da " + "a pessoa:");
			System.out.print("Nome: ");
			String nome = scn.nextLine();
			
		}
		
		
		scn.close();

	}

}
