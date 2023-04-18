package logica.exercicios.aula4;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		
		int idade = sc.nextInt();
		
		System.out.println("Seu nome é: " + nome + ". Você tem " + idade + " anos.");
		
		
	}

}