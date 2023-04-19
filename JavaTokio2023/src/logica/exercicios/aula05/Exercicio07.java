package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// Crie um programa que receba o valor do produto e valor pago.
		// ▪ Calcule o troco a ser pago.
		// ▪ O valor do troco deve ser exibido no terminal.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do produto: ");
		float valor = sc.nextFloat();
		
		System.out.println("Qual foi o valor pago? ");
		float valorPago = sc.nextFloat();
		
		float troco = valorPago - valor;
		
		System.out.printf("Troco: %.2f", troco);

	}

}
