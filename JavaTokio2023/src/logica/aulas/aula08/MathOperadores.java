package logica.aulas.aula08;

import java.util.Random;

public class MathOperadores {

	public static void main(String[] args) {
		
		double PI = Math.PI; // armazena o número PI
		System.out.println(PI);
		
		System.out.println(Math.sqrt(225)); // raiz quadrada
		
		System.out.println(Math.abs(-63)); // número absoluto
		
		double num = 3.5;
		
		System.out.println(Math.ceil(num)); // arredonda para cima
		
		System.out.println(Math.floor(num)); // arredonda para baixo
		
		System.out.println(Math.round(num)); // arredonda de acordo com o decimal
		
		
		double random = Math.random();
		System.out.println(random); // mostra um nº aleatório entre 0 e 1
		
		double multiplica = random * 5;
		System.out.println(multiplica); // mostra números aleatórios entre 0 e 5
		
		System.out.println(Math.ceil(multiplica)); // arredonda o número aletório para cima (é possível mostrar 5 e não tem mais 0)
		
		int min = 5;
		int max = 10;
		
		double intervalo = min + random * (max - min);
		
		System.out.println(intervalo);
		
		Random rand = new Random();
		
		System.out.println(rand.nextInt(5, 10));
		
		String str = "FIAP";
		
		System.out.println(str.length()); // mostra a quantidade de caracteres armazenados

	}

}
