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
		int dia = sc.nextInt();
		
		int dias1 = dia / 365;
		int meses = dia - (dia / 30);
		
		
		
		System.out.println("Você tem " + dias1 + " anos, " + meses + " meses e " + dia);


	}

}
