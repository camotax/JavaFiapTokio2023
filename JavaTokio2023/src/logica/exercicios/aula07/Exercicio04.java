package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe
			qual é a soma deles.*/
		
		int i = 0;
		int soma = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um valor: ");
			num = sc.nextInt();
			soma+=num;
			i++;
		} while(i < 10);
		
		System.out.println("A soma é: " + soma);

	}

}
