package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e
		// informe a média ponderada do aluno, sabendo que a nota A tem peso 4 e a nota B
		// tem peso 6.
		// ▪ Exemplo: nota a * 4 e nota b * 6.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1 do aluno: ");
		float A = sc.nextFloat();
		
		System.out.print("Digite a 2º nota: ");
		float B = sc.nextFloat();
		
		float media = (4 * A) + (6 * B) / (4 + 6);
		
		System.out.printf("A média ponderada do aluno é: %.1f", media);
		
		

	}

}
