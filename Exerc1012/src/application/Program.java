package application;

import java.util.Locale;
import java.util.Scanner;

import entities.QuartosDisp;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {

			int qtdeQuartos = 0;
			int numQuartoAlugado = 0;
			String nome = "";
			String email = "";
			QuartosDisp[] quartosDisp = new QuartosDisp[10];

			System.out.print("Quantos quartos serão alugados? ");
			qtdeQuartos = Integer.parseInt(scn.nextLine());

			for (int i = 0; i < qtdeQuartos; i++) {
				System.out.println("Aluguel #" + (i + 1));
				System.out.print("Nome: ");
				nome = scn.nextLine();
				System.out.print("E-mail: ");
				email = scn.nextLine();
				System.out.print("Quarto a ser alugado: ");
				numQuartoAlugado = Integer.parseInt(scn.nextLine());
				quartosDisp[numQuartoAlugado] = new QuartosDisp(numQuartoAlugado, nome, email);

			}
			System.out.println("--------------------------------");
			System.out.println("Quartos ocupados:");
			for (int i = 0; i < quartosDisp.length; i++) {
				if (quartosDisp[i] != null) {
					System.out.println(quartosDisp[i]);
				}
			}

		} finally {
			scn.close();
		}

	}

}
