package logica.aulas.aula05;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		//f converte para float
		float preco = 10.99f;
		float preco2 = (float) 19.33;
		
		System.out.println("Float1: " + preco);
		System.out.println("Float2: " + preco2);
		
		int precoInteiro = (int) 2.50;
		
		// typecast: exibe somente a parte inteira do número
		
		System.out.println("Valor Inteiro: " + precoInteiro);
		
		// quando usuário insere valor, converte double para inteiro
		
		// %.2f definir quantas casas decimais quer mostrar: 2 casas decimais
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("Digite um número: ");
		
		double numeroDouble = sc.nextDouble();
		
		int numeroIn = (int) numeroDouble;
		
		System.out.println(numeroIn);
		
		
	}

}
