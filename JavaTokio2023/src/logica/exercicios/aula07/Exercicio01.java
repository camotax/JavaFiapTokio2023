package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Faça um programa que exiba a mensagem “Olá, Mundo”.
			▪ Essa mensagem deverá ser exibida repetidamente.
			▪ Ao final de toda iteração da repetição, você deve perguntar ao usuário se ele deseja
			exibir a mensagem novamente.
			▪ Se sim, exiba novamente. Senão, saia do loop e exiba a mensagem “Fim”.*/
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		String yn;
		
		do {
			
			System.out.println("Olá Mundo.");
	
			System.out.print("Deseja exibir novamente? (sim/não) ");
			yn = sc.nextLine();
			i++;
			
		} while(yn.equals("sim"));
		
		System.out.println("FIM");
			

	}

}
