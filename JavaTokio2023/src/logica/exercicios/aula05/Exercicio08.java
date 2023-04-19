package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Montar um script onde o usuário entre com o valor em Reais e faça a sua respectiva
		// conversão para:
		//▪ Dólar Americano – Euro - Peso Argentino - Libra Esterlina - Iene
		//▪ Exibir na tela todos os valores obtidos com apenas 02 casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor em real: ");
		float real = sc.nextFloat();
		
		float dolar = real * 0.20f;
		float euro = real * 0.18f;
		float peso = real * 42.79f;
		float libra = real * 0.16f;
		float iene = real * 26.52f;
		
		System.out.println("Valor em dolar: " + dolar);
		System.out.println("Valor em euro: " + euro);
		System.out.println("Valor em peso argentino: " + peso);
		System.out.println("Valor em libra esterlina: " + libra);
	 	System.out.println("Valor em iene: " + iene);

	}

}
