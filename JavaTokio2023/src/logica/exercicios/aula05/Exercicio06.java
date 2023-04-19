package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Neste problema, deve-se ler o nome de uma peça que chamaremos de peça1, o
		// número de peças1 que o usuário quer, o valor unitário de cada peça1, o nome de uma
		// peça2, o número de peças2 e o valor unitário de cada peça2. Após, calcule e mostre o
		// valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome da peça: ");
		String peca1 = sc.nextLine();
		
		System.out.print("Digite a quantidade de peças solicitadas: ");
		int numPeca1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Digite o valor unitário de cada peça: ");
		double valor1 = Double.parseDouble(sc.nextLine());
		
		double soma1 = valor1 * numPeca1;
		
		System.out.println(" ");
		
		System.out.print("Digite o nome da peça: ");
		String nome2 = sc.nextLine();
		
		System.out.print("Digite a quantidade de peças solicitadas: ");
		int numPeca2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Digite o valor unitário de cada peça: ");
		double valor2 = Double.parseDouble(sc.nextLine());
		
		double soma2 = valor2 * numPeca2;
		
		double total = soma1 + soma2;
		
		System.out.println("O valor total a ser pago é: " + total);
		
		

	}

}
