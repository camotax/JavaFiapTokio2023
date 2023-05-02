package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um programa que verifica o dia da semana.
		// ▪ Se for terça-feira, exiba ao usuário que terá feira de rua.
		
		Calendar c = Calendar.getInstance();
		
		int semana = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(semana);
		
		if(semana == 3) {
			System.out.println("Hoje é dia de feira.");
		}
		else {
			System.out.println("Hoje não tem feira");
		}
		
	}

}
