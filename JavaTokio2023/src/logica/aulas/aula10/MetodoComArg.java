package logica.aulas.aula10;

import java.util.Scanner;

public class MetodoComArg {
	
	// MÉTODOS SEM RETORNO E COM ARGUMENTOS
	
	static void saudacaoComArgs(String nome, int idade) {
		System.out.println(nome);
		System.out.println(idade); //parâmetros
		
		if(idade >= 18) {
			System.out.printf("Olá, %s! Você tem %d anos e é maior de idade.", nome, idade);
		} else {
			System.out.printf("Olá, %s! Você tem %d anos e é menor de idade.", nome, idade);
		}
	}
	
	static void somar(int num1, int num2) {
		System.out.println("Soma: " + (num1 + num2));
	}

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine(); // não tem relação com 'nome' - parâmetro
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt(); // variáveis
		
		saudacaoComArgs(nome, idade);
		
		sc.close();*/
		
		// SOMAR DOIS NÚMEROS
		somar(8, 6);

	}

}
