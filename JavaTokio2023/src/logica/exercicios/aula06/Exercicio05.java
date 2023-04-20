package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que recebe dois números e um caractere (representando uma
			das operações matemáticas (+, -, *, /)
			▪ O programa deve calcular o valor final de acordo com a operação selecionada.
			▪ Ou seja, se a entrada for 5, 6 e *, então seu programa dever mostrar 30.

			▪ Dica: switch/case facilita as coisas. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um caractere (+, -, *, /) e dois números: ");
		String op = sc.nextLine();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

			
		switch(op) {	
			case "+":
				int soma = n1 + n2;
				System.out.println(soma);
				break;
			case "-":
				int sub = n1 - n2;
				System.out.println(sub);
				break;
			case "*":
				int mul = n1 * n2;
				System.out.println(mul);
				break;
			case "/":
				int div = n1 / n2;
				System.out.println(div);
				break;
		}

	}

}
