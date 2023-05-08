package logica.exercicios.aula08;

public class Exercicio06 {

	public static void main(String[] args) {
		/* Faça um programa que sorteio 100 números inteiros entre 0 e 100 (incluindo 100).
			▪ Ao final, exiba as seguintes informações:
			▪ Foram sorteados XX números pares.
			▪ Foram sorteados XX números ímpares.
			▪ Foram sorteados XX números primos. */
		
		int min = 0;
		int max = 101;
		int num = 0;
		
		int qtdPrimos = 0;
		
		for(int i =0; i < 10; i++) {
			num = (int) (min + Math.random() * (max - min));
			System.out.println(num);
			
			int div = 2;
			
			while(num % div != 0) {
				div++;
			}
			if(div == num) {
				qtdPrimos++;
			}
		}
		
		

	}

}
