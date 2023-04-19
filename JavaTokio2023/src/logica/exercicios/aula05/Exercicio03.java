package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Elabore um programa que receba o nome do usuário e o seu gênero da seguinte
		// forma:
			// ▪ [ M ] para masculino
			// ▪ [ F ] para feminino
			// ▪ [ O ] outro
			// ▪ [ N ] não responder

			// ▪ Exiba uma mensagem final da seguinte forma:
			// ▪ “Olá, Alexandre! Você escolheu a seguinte opção de gênero: M”
			// ▪ Dica: utilize o tipo char para o gênero.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu gênero de acordo com as instruções: \n "
				+ "			[ M ] para masculino\r\n"
				+ "			[ F ] para feminino\r\n"
				+ "			[ O ] outro\r\n"
				+ "			[ N ] não responder");
		
		char gen = sc.nextLine().charAt(0);
		
		System.out.println("Olá, " + nome + "! Você escolheu a seguinte opção de gênero: " + gen);
	}

}
