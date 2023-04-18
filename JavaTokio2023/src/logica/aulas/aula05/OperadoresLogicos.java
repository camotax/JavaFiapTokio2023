package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean logicaE = true && true;
		
		System.out.println(logicaE);
		
		boolean logicaE2 = false && true;
		
		System.out.println(logicaE2);
		
		// UTILIZANDO VARIÁVEIS
		
		boolean senha = true;
		boolean email = false;
		
		boolean logicaE3 = senha && email;
		
		System.out.println(logicaE3);
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		boolean negacao = !true; // nega o valor true
		System.out.println(negacao);
		
		
		// OPERADORES DE STRINGS
		
		String nome1 = "Joana";
		String nome2 = "Joana";
		String nome3 = new String("Joana"); //objeto
		
		System.out.println(nome1 == nome2); // compara strings
		System.out.println(nome1.equals(nome3)); // compara objeto
		
		

	}

}
