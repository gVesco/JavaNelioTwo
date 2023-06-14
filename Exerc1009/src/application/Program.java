package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int quantPessoas = scn.nextInt();
		scn.nextLine();
		
		Pessoa pessoaMaisVelha = null;
		
		for (int i = 0; i < quantPessoas; i++) {
			System.out.println("Dados da " + (i+1)  + "a pessoa:");
			System.out.print("Nome: ");
			String nome = scn.nextLine();
			
			System.out.print("Idade: ");
			int idade = scn.nextInt();
			scn.nextLine();

			Pessoa pessoa = new Pessoa(nome, idade);
			
			if (pessoaMaisVelha == null || pessoaMaisVelha.getIdade() < pessoa.getIdade()) {
				pessoaMaisVelha = pessoa;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + pessoaMaisVelha.getNome());
		scn.close();
	}

}
