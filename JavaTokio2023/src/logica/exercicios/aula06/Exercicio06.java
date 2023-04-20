package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um programa que receba o ano de nascimento da pessoa e retorne:
			▪ Se o voto é obrigatório este ano;
			▪ Se o voto é opcional este ano;
			▪ Se o voto é proibido este ano.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu ano de nascimento: ");
		int ano = sc.nextInt();
		
		int idade = 2023 - ano;
		
		if(idade >= 18 && idade <= 70) {
			System.out.println("Obigatório votar este ano");
		}
		else if(idade >= 16 && idade < 18) {
			System.out.println("Opcional votar este ano");
		}
		else if (idade > 70) {
			System.out.println("Voto opcional.");
		}
		else {
			System.out.println("Voto proíbido");
		}

	}

}
