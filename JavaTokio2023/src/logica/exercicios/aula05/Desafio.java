package logica.exercicios.aula05;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		/* Faça o cálculo contrário do último exercício (Exercício 10):
		 ▪ Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em
		anos, meses e dias. Também considere todo ano com 365 dias e todo mês com 30
		dias.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos dias de vida tem: ");
		double idDias = sc.nextInt();
		
		double idadeAnos = idDias / 365;
		double meses = (((idadeAnos - (int)idadeAnos) * 365) / 30);
		double dias = ((meses - (int)meses) * 30);
		
		
		
		System.out.printf("Você tem " + (int)idadeAnos + " anos, " + (int)meses + " meses e %.0f" + dias);


	}

}
