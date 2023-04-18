package exercicios.extras;

import java.util.Scanner;

public class Ex1_17_04 {

	public static void main(String[] args) {
		
				// usuário digita número inteiro
				// a) O número digitado pelo usuário;
				// b) O seu sucessor;
				// c) O seu antecessor;
				// d) O dobro do número digitado
				// e) A metade do número digitado.
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Olá, digite um número inteiro: ");
				int num = sc.nextInt();
				
				int sucessor = num + 1;
				
				int antecessor = num - 1;
				
				int dobro = num * 2;
				
				float metade = num / 2;
				
				System.out.println("O número digitado: " + num + "\n"
						+ "O seu sucessor: " + sucessor + "\n"
						+ "O seu antecessor: " + antecessor + "\n"
						+ "O dobro do número: " + dobro + "\n"
						+ "A metade: " + metade);
				
	}

}
