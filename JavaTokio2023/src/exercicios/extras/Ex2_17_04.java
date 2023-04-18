package exercicios.extras;

import java.util.Scanner;

public class Ex2_17_04 {

	public static void main(String[] args) {
		
		//Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de 70cm de distância.
		//Faça um programa onde o usuário informe a distância do inimigo e sejam exibidas as mensagens
		//“ATIVADO” ou “DESATIVADO” dependendo do status da arma.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a distância do inimigo: ");
		int cm = sc.nextInt();

		if(cm>70) {
			System.out.println("DESATIVADO");
		}
		else {
			System.out.println("ATIVADO");
		}

	}

}
