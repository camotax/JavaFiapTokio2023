package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Determine e mostre todos os números primos no intervalo de 2 a 2000.

			Dicas:
			▪ Para resolver esse problema, primeiro faça um algoritmo que verifica se um número
			inteiro qualquer é primo ou não.
			▪ A seguir, com esse código em mãos, faça os ajustes necessários para mostrar todos os
			números primos no intervalo solicitado.
			▪ Você precisará colocar uma estrutura de repetição dentro da outra.
			▪ Laços aninhados!!!! */
		
//      boolean primo = true;
//      
//      int i = 0;
//      
//      while (num % i == 0) {
//      	
//          i++;
//      }
//      
//      if (primo) {
//          System.out.println(num + " ");
//      }
		
		
		System.out.println("Números primos no intervalo de 2 a 2000:");
		
		
        for (int num = 2; num <= 2000; num++) {
        	int div = 2;
        	while(num % div != 0) {
        		div++;
        	}
        	
        	
        	if (div == num) {
        		System.out.println(num + " é primo.");
        	}

        }
	}

}
