package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Um professor quer saber quantos alunos de uma sala de 20 tiveram nota maior do
			que a média. Faça um programa onde o professor informe a média da turma e as
			notas de cada um dos 20 alunos e, ao final, seja exibido quantos alunos tiveram nota
			superior à média e quantos tiveram nota inferior à média.*/
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		double nota = 0;
		double acima = 0;
		double abaixo = 0;
		
		
		System.out.print("Insira a média da sala: ");
		double media = sc.nextDouble();
		
		do {
			System.out.println("Digite a nota do aluno " + i + ": ");
			nota = sc.nextDouble();
			i++;
			
			if(nota > media) {
				acima++;
			} else if (nota < media) {
				abaixo++;
			}
			
		} while (i <= 20);
		
		System.out.println("Há " + (int)acima + " alunos acima da média e " + (int)abaixo + " alunos abaixo da média.");

	}

}
