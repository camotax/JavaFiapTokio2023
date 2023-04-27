package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Faça um programa capaz de exibir todos os valores pares entre 2 e um valor fornecido
		// pelo usuário.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i+=2) {
			System.out.println(i);
		}

	}

}
