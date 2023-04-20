package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Faça um programa para a leitura de quatro notas parciais de um aluno. O programa
			deve calcular a média alcançada pelo aluno e apresentar:
			▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
			▪ A mensagem "Reprovado", se a média for menor que cinco.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 4 notas do aluno: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 7) {
			System.out.println("APROVADO");
		}
		else if(media >= 5 && media < 7) {
			System.out.println("RECUPERAÇÃO");
		}
		else {
			System.out.println("REPROVADO");
		}

	}

}
