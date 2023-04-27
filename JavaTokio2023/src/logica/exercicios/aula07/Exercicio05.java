package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Faça um programa que receba 12 valores digitados pelo usuário e, ao final, informe
			qual é o maior deles.*/
		
		int i = 0;
		int n = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um valor: ");
			num = sc.nextInt();
			
			if(num > n) {
				n = num;
			}
			
			i++;
			
			} while(i < 12);
		
		System.out.println("O maior número é:  " + n);
		

	}

}
