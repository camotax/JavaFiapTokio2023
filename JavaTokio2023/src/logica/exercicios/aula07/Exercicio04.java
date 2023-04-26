package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe
			qual é a soma deles.*/
		
		int i = 0;
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um valor: ");
			soma = sc.nextInt();
			soma+=soma;
			i++;
		} while(i <= 10);
		
		System.out.println("A soma é: " + soma);

	}

}
