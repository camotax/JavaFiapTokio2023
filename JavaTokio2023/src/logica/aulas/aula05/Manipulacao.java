package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {
		
		// manipula um valor double para string
		
		double salario = 1360.63;
		String salarioStr = Double.toString(salario);
		
		
		//get class -> mostra o tipo de variável
		
		System.out.println("Salário em String \ne tipo de variável: \n" + salarioStr + " - " + salarioStr.getClass().getSimpleName());
		
		
		//converter String para variável
		
		System.out.println(" "); //pula linha
		
		String idade = "23";
		
		int idadeInt = Integer.parseInt(idade);
		
		System.out.println("Idade inteiro: " + idadeInt);
		
		
		// String para float
		
		System.out.println(" ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço: ");
		
		String preco = sc.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		
		System.out.println("O preço em float: " + precoFloat);

	}

}
