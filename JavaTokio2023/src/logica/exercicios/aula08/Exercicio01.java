package logica.exercicios.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Faça um programa que verifica a hora do dia e exiba a mensagem ao usuário com o
			nome dele:
			▪ “Bom dia, FULANO!” se for maior ou igual que 6h da manhã
			▪ “Boa tarde, FULANO!” se for maior ou igual que 12h 
			▪ “Boa noite, FULANO!” se for maior ou igual que 18h*/
		
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println(hora);
		
		if(hora < 12) {
			System.out.println("BOM DIA, " + nome + "!");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("BOA TARDE, " + nome + "!");
		} else if(hora >= 18) {
			System.out.println("BOA NOITE, " + nome + "!");
		}

	}

}
