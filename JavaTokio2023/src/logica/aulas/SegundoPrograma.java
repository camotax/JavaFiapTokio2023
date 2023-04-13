package logica.aulas;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Olá, " + nome + ". Bem-vinda!");
		
		System.out.println("Digite sua idade: ");
		System.out.println("Sua idade é: " + sc.nextLine());
		
	}

}
