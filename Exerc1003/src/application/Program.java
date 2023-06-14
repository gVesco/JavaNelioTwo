package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
		System.out.print("Quantas pessoas serão digitadas? ");
		int qtdePessoas = scn.nextInt();
		scn.nextLine(); // Consumir a quebra de linha pendente após a leitura do número inteiro
		Pessoa[] pessoas = new Pessoa[qtdePessoas];
		String[] nomesMenores = new String[qtdePessoas]; // Criar o array para armazenar os nomes das pessoas menores de 16 anos
		double alturaTotal = 0.00;
		int possuiMenosDezesseis = 0;

		
		for (int i = 0; i < qtdePessoas; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = scn.nextLine();
			System.out.print("Idade: ");
			int idade = scn.nextInt();
			scn.nextLine(); // Consumir a quebra de linha pendente após a leitura do número inteiro
			System.out.print("Altura: ");
			double altura = scn.nextDouble();
			scn.nextLine(); // Consumir a quebra de linha pendente
			
			if (idade < 16) {
				nomesMenores[possuiMenosDezesseis] = nome; // Armazenar o nome da pessoa menor de 16
				possuiMenosDezesseis++; // Somar quantidade de pessoas
			}
			
			pessoas[i] = new Pessoa(nome, idade, altura);
			alturaTotal += altura;
		}
		
		double percMenores = (double) possuiMenosDezesseis / qtdePessoas * 100;
		
		double alturaMedia = alturaTotal / qtdePessoas;
		System.out.println(String.format("Altura média: %.2f", alturaMedia));
		System.out.println(String.format("Pessoas com menos de 16 anos: %.2f", percMenores) + "%");
		
		for (int i = 0; i < possuiMenosDezesseis; i++) {
			System.out.println(nomesMenores[i]);
		}
		scn.close();

	}

}
