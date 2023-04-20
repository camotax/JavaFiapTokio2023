package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {
		
		// TABUADA
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i = 0;
//		
//		System.out.print("Digite um número: ");
//		int n = sc.nextInt();
//		
//		while(i < 10) {
//			System.out.println(n + " * " + i + " = " + n * i);
//			i++;
//		}
		
		// MODIFICADORES DE LAÇO
		
		int i = 0;
		
		while(i < 10) {
			i++;
			
			if(i == 3) {
				continue; // não executa o 3
			}
			
			if(i == 7) {
				break; // quebra o looping 
			}
			System.out.println("Carro " + i);
		}
		
		System.out.println("FIM");
		
		
		
		

	}

}
