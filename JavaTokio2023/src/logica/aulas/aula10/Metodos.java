package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	// MÉTODOS SEM PARÂMETROS E SEM RETORNO
	
	static void saudacao() {
		System.out.println("Bem-vindo ao programa");
		System.out.println("Esse método só executa algo.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int id = sc.nextInt();
		
		System.out.printf("Olá, %s! Voce tem %d anos\n", nome, id);
		
		if(id >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade.");
		}
	}

	public static void main(String[] args) {
		
		saudacao();
		saudacao();

	}

}
