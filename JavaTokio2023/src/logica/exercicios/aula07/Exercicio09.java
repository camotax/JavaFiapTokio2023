package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que recebe um inteiro positivo n e imprime todos os divisores
			positivos de n.
			▪ Utilize o laço for.

			▪ Exemplo:
			Suponha que n = 28, nessa situação devemos imprimir os números
			1, 2, 4, 7, 14 e 28, que são todos os divisores do 28.

			▪ Dica: para o número ser divisor de n, a divisão precisa ter resto nulo.*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int res = 0;
		
		System.out.print("Insira um valor positivo: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
		res = n%i;
		
		if(res == 0) {
			System.out.println(i);
			}
		}

	}

}
