package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Quantos alunos serao digitados? ");

			int qtdeAlunos = Integer.parseInt(scn.nextLine());

			Aluno[] aluno = new Aluno[qtdeAlunos];
			String[] aprovados = new String[qtdeAlunos];
			int aprovadosCount = 0;
			
			for (int i = 0; i < qtdeAlunos; i++) {
				System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
				String nome = scn.nextLine();
				double notaUm = Double.parseDouble(scn.nextLine());
				double notaDois = Double.parseDouble(scn.nextLine());
				
				double notaMedia = Aluno.calcularMedia(notaUm, notaDois);

				aluno[i] = new Aluno(nome, notaUm, notaDois, notaMedia);

				if (aluno[i].getNotaMedia() >= 6) {
					aprovados[i] = aluno[i].getNome();
					aprovadosCount++;
				}

			}

			System.out.println("Alunos aprovados:");
			for (int i = 0; i < (aprovadosCount + 1); i++) {
				if (aprovados[i] != null) {
					System.out.println(aprovados[i]);
				}
			}
		} finally {
			scn.close();
		}
	}

}