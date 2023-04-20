package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa etc.
			▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo:

			Tipo cliente / Valor do KW/h
			1 (residência) / 0,60
			2 (comércio) / 0,48
			3 (indústria) / 1,29 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha qual cliente você é:\n"
				+ "1 - residência\n"
				+ "2 - comércio\n"
				+ "3 - indústria");
		int client = sc.nextInt();
		
		System.out.print("Digite o quanto gastou de luz: ");
		double val = sc.nextDouble();
		 
		switch(client) {
		
		case 1:
			double c1 = val * 0.6;
			System.out.println("O valor da conta de luz será: " + c1);
			break;
		case 2:
			double c2 = val * 0.48;
			System.out.println("O valor da conta de luz será: " + c2);
			break;
		case 3:
			double c3 = val * 1.29;
			System.out.println("O valor da conta de luz será: " + c3);
			break;
		default:
			System.out.println("Erro");
		} 

	}

}
