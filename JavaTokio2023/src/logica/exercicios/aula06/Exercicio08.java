package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
			fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

			▪ Dê sua resposta em km por litro de combustível (km/Litro)

			▪ Caso a autonomia do veículo esteja abaixo de 8 km/L, exiba a mensagem:
			▪ “Esse carro bebe hein!”
			▪ Senão, exiba a mensagem:
			▪ “Autonomia legal”*/
		
		 Scanner sc = new Scanner(System.in);
		
		
		 System.out.print("Distância percorrida: ");
		 float dis = sc.nextFloat();
		 
		 System.out.print("Combustível gasto: ");
		 float comb = sc.nextFloat();
		 
		 float consumo = dis / comb;
		 
		 System.out.println("O consumo médio é " + consumo + " Km/l.");
		 
		 
		 

	}

}
