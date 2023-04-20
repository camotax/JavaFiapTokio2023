package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		soma += num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		soma += num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		soma += num;
		
		System.out.println("A soma é: " + soma);
		

	}

}
