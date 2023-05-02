package logica.exercicios.aula08;

public class Exercicio04 {

	public static void main(String[] args) {
		// Fazer a operação matemática
		
		double x = Math.sqrt(81);
		
		double pi = Math.PI;
		
		double y = (5 * x + 2 * Math.pow(x, 2) + Math.cbrt(8) - pi * x) / Math.pow(3, 4) + x;
		
		System.out.printf("O resultado da operação é: " + y);

	}

}
