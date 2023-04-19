package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e
		// informe a média ponderada do aluno.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1 do aluno: ");
		double A = sc.nextDouble();
		
		System.out.print("Digite a 2º nota: ");
		double B = sc.nextDouble();
		
		double media = (A + B) / 2;
		
		System.out.printf("A média do aluno é: %.1f", media);

	}

}
