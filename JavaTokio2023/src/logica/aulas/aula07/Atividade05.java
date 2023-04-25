package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i <= qtd; i++) {
			System.out.println("Produto: " + i);
		}

	}

}
