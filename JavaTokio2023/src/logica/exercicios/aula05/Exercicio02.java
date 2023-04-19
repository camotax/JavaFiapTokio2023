package logica.exercicios.aula05;

public class Exercicio02 {

	public static void main(String[] args) {
		// Elabore um programa que declare um número inteiro, float e double.
		// ▪ Atribua valores à essas 3 variáveis.
		// ▪ Exiba no terminal os 3 valores como números.

		// ▪ Agora, converta esses 3 números para String e exiba novamente.
		
		int numInt = 96;
		float numFl = 2.69f;
		double numDou = 896.32d;
		
		System.out.println(numInt);
		System.out.println(numFl);
		System.out.println(numDou);
		
		System.out.println(" ");
		
		String intStr = Integer.toString(numInt);
		String flStr = Float.toString(numFl);
		String douStr = Double.toString(numDou);
		
		System.out.println(intStr);
		System.out.println(flStr);
		System.out.println(douStr);

	}

}
