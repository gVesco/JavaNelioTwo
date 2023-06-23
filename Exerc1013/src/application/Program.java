package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		try {

			int qtdeFuncRegistrar = 0;
			int idFunc = 0;
			double salarioFunc = 0.0;
			String nomeFunc = "";

			// Entrada do usuário com a quantidade de funcionários a registrar
			System.out.print("Quantos funcionários serão registrados? ");
			qtdeFuncRegistrar = Integer.parseInt(scn.nextLine());

			// Instancia objeto Funcionario com a quantidade a registrar
			Funcionario[] funcionario = new Funcionario[qtdeFuncRegistrar];

			// Inicia loop para informar dados de cada funcionário a cadastrar
			for (int i = 0; i < qtdeFuncRegistrar; i++) {
				System.out.println("Funcionário #" + (i + 1) + ":");
				System.out.print("Id: ");
				idFunc = Integer.parseInt(scn.nextLine());

				// Verifica se o ID informado já está em uso
				boolean idExiste = false;
				for (int j = 0; j < i; j++) {
					if (funcionario[j].getIdFunc() == idFunc) {
						// Caso ID esteja em uso, registra na variável idExiste e interrompe a
						// verificação de IDs
						idExiste = true;
						break;
					}
				}

				if (idExiste) {
					// Caso ID esteja em uso informará ao usuário e voltará para reinserção de um
					// novo ID
					System.out.println("O ID informado já está em uso, por gentileza insira um ID válido.");
					i--;
					continue;
				}

				System.out.print("Nome: ");
				nomeFunc = scn.nextLine();
				System.out.print("Salário: ");
				salarioFunc = Double.parseDouble(scn.nextLine());

				funcionario[i] = new Funcionario(idFunc, salarioFunc, nomeFunc);

			}

			System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
			int idFuncAumento = Integer.parseInt(scn.nextLine());

			Funcionario funcionarioAumento = null;

			// Procura ID entre os funcionários cadastrados
			for (Funcionario func : funcionario) {
				if (func.getIdFunc() == idFuncAumento) {
					funcionarioAumento = func;
					break;
				}
			}

			// Se não encontrar o ID, imprime aviso e não realiza aumento
			if (funcionarioAumento == null) {
				System.out.println("Funcionário com o ID informado não encontrado.");
			} else {
				// Se houver ID no parâmetro, solicita percentual do aumento e o realiza
				System.out.print("Insira o percentual do aumento: ");
				double percAumento = Double.parseDouble(scn.nextLine());
				funcionarioAumento.aumentarSalario(percAumento);
			}

			System.out.println("\nLista dos funcionários:");
			for (Funcionario vect : funcionario) {
				System.out.println(vect);
			}

		} finally {
			scn.close();
		}

	}

}
