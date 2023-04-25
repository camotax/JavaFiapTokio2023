package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
			seguinte critério, baseado no salário atual:
			▪ Salários até R$ 280,00 (incluindo): aumento de 20%.
			▪ Salários entre R$ 280,00 e R$ 700,00: aumento de 15%.
			▪ Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%.
			▪ Salários de R$ 1500,00 em diante: aumento de 5%.

			▪ Após o aumento ser realizado, informe na tela:
			▪ O salário antes do reajuste.
			▪ O percentual de aumento aplicado.
			▪ O valor do aumento.
			▪ O novo salário, após o aumento.*/
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite seu salário: ");
		double sal = sc.nextDouble();
		
		if(sal <= 280) {
			double valor = sal*0.2;
			double reaj = sal + valor;
			System.out.println("Salário anterior: " + sal);
			System.out.println("O reajuste foi de 20%.");
			System.out.println("Valor do aumento: " + valor);
			System.out.println("Reajuste: " + reaj);
		}
		else if(sal > 280 || sal <=700 ) {
			double valor = sal*0.15;
			double reaj = sal + valor;
			System.out.println("Salário anterior: " + sal);
			System.out.println("O reajuste foi de 15%.");
			System.out.println("Valor do aumento: " + valor);
			System.out.println("Reajuste: " + reaj);
		}
		else if(sal > 700 || sal <=1500 ) {
			double valor = sal*0.10;
			double reaj = sal + valor;
			System.out.println("Salário anterior: " + sal);
			System.out.println("O reajuste foi de 10%.");
			System.out.println("Valor do aumento: " + valor);
			System.out.println("Reajuste: " + reaj);
		}
		else if(sal > 1500 ) {
			double valor = sal*0.05;
			double reaj = sal + valor;
			System.out.println("Salário anterior: " + sal);
			System.out.println("O reajuste foi de 5%.");
			System.out.println("Valor do aumento: " + valor);
			System.out.println("Reajuste: " + reaj);
		}
	}

}
