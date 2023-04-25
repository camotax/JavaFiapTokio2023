package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Faça um programa que recebe:
			▪ o código do estado de origem da carga de um caminhão, supondo que é um número inteiro
			de 1 a 5
			▪ o peso da carga do caminhão em toneladas
			▪ o código da carga, supondo que é um número inteiro de 10 e 40

			▪ Seu programa deve calcular:
			▪ o peso da carga do caminhão convertido em quilos
			▪ o preço da carga do caminhão
			▪ valor do imposto que e cobrado com base no preço da carga e do estado de origem
			▪ o valor total transportado pelo caminhão (carga + impostos)*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do estado de origem do caminhão\n de acordo com a tabela: \n "
				+ "			[ 1 ] 35%\n"
				+ "			[ 2 ] 25%\n"
				+ "			[ 3 ] 15%\n"
				+ "			[ 4 ] 5% \n"
				+ "			[ 5 ] isento");
		int origem = sc.nextInt();
		
		System.out.print("Digite o peso da carga em toneladas: ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite o código de carga de acordo com a tabela: \n"
				+ "			[ 10 a 20 ] R$100,00 kg\n"
				+ "			[ 21 a 30 ] R$250,00 \n"
				+ "			[ 31 a 40 ] R$340,00 \n");
		int carga = sc.nextInt();
		
		double quilo = peso * 1000;
		double imposto = 0;
		double total = 0;
		
		if(carga >= 10 || carga <= 20) {
			double precoCarga = 100 * quilo;
			if(origem == 1) {
				imposto = precoCarga * 0.35;
				total = imposto + precoCarga;
			}
			else if(origem == 2) {
				imposto = precoCarga * 0.25;
				total = imposto + precoCarga;
			}
			else if(origem == 3) {
				imposto = precoCarga * 0.15;
				total = imposto + precoCarga;
			}
			else if(origem == 4) {
				imposto = precoCarga * 0.05;
				total = imposto + precoCarga;
			}
			System.out.println("O valor em quilos: " + quilo + "\nPreço da carga: " + precoCarga);
			System.out.println("\nValor do imposto: " + imposto + "\nValor total: " + total);
		}
		else if(carga >= 21 || carga <=30) {
			double precoCarga = 250 * quilo;
			if(origem == 1) {
				imposto = precoCarga * 0.35;
				total = imposto + precoCarga;
			}
			else if(origem == 2) {
				imposto = precoCarga * 0.25;
				total = imposto + precoCarga;
			}
			else if(origem == 3) {
				imposto = precoCarga * 0.15;
				total = imposto + precoCarga;
			}
			else if(origem == 4) {
				imposto = precoCarga * 0.05;
				total = imposto + precoCarga;
			}
			System.out.println("O valor em quilos: " + quilo + "\nPreço da carga: " + precoCarga);
			System.out.println("\nValor do imposto: " + imposto + "\nValor total: " + total);
			
		}
		else if(carga >= 31 || carga <=40) {
			double precoCarga = 340 * quilo;
			if(origem == 1) {
				imposto = precoCarga * 0.35;
				total = imposto + precoCarga;
			}
			else if(origem == 2) {
				imposto = precoCarga * 0.25;
				total = imposto + precoCarga;
			}
			else if(origem == 3) {
				imposto = precoCarga * 0.15;
				total = imposto + precoCarga;
			}
			else if(origem == 4) {
				imposto = precoCarga * 0.05;
				total = imposto + precoCarga;
			}
			System.out.println("O valor em quilos: " + quilo + "\nPreço da carga: " + precoCarga);
			System.out.println("\nValor do imposto: " + imposto + "\nValor total: " + total);
		}
		
		
		

	}

}
