package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Faça um programa que recebe um texto qualquer do usuário.
		▪ A seguir, exiba:
		▪ A quantidade de caracteres alfabéticos maiúsculos
		▪ A quantidade de caracteres alfabéticos minúsculos
		▪ A quantidade de caracteres numéricos
		▪ A quantidade de espaço em branco*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto qualquer: ");
		String txt = sc.nextLine();
		
		int upper = 0, lower = 0, num = 0, branco = 0, especial = 0;
		
		for(int i = 0; i < txt.length(); i++) {
			char ch = txt.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				upper++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				lower++;
			}
			else if(ch >= '0' && ch <= '9') {
				num++;
			}
			else if(ch == ' ') {
				branco++;
			}
			else {
				especial++;
			}
		}
		
		System.out.println("Há " + upper + " caracteres maiúculos.");
		System.out.println("Há " + lower + " caracteres minúsculos.");
		System.out.println("Há " + num + " caracteres de números.");
		System.out.println("Há " + branco + " caracteres brancos.");
		System.out.println("Há " + especial + " caracteres especiais.");
		
	}

}
