package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {

		float num1 = 5f;
		float num2 = 6f;
		
		float soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
		
		
		float sub = num1 - num2;
		
		System.out.println("Subtração" + sub);
		
		
		float mult = num1 * num2;
		
		System.out.println("Multiplicação:" + mult);
		
		
		float restodiv = num1 % num2;
		
		System.out.println("Resto da divisão: " + restodiv);
		
		// OPERADORES UNÁRIOS
		
		int num = 15;
		
		System.out.println(num);
		
		num++;
		
		System.out.println(num); //soma antes e depois exibe
		
		System.out.println(++num); //soma e exibe
		
		//system.out.println(num++) -> primeiro exibe e depois soma (ñ mostra o novo valor)
		
		System.out.println(--num);
		
		// OPERADOR DE ATRIBUIÇÃO
		
		int number = 5;
		
		number += 5; // 5 + 5
		System.out.println("Int: 5\nValor 5 somado: " + number);
		
		number -=2; // 10 - 2
		System.out.println("Novo valor number subtraído: " + number);
		
		

	}

}
