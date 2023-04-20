package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Faça um programa que peça dois números e imprima o maior deles, e informe caso
		eles sejam iguais.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println("Número maior: " + num);
			
		}
		else if(num == num2) {
			System.out.println("Os números são iguais.");
		}
		else {
			System.out.println("Número maior: " + num2);
		}

	}

}
