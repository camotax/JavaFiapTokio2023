package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) { 
		
		//Faça um programa que leia um número, e informe se ele é par ou impar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();
		
		int cal = valor%2;
		
		if(cal == 1) {
			System.out.println("O número é impar");
		}
		else {
			System.out.println("O número é par.");
		}
	}

}
