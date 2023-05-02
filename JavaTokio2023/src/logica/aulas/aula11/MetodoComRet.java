package logica.aulas.aula11;

public class MetodoComRet {
	
	// MÉTODO COM RETORNO
	
	static int somar(int a, int b) {
		//int soma = a + b;
		return a + b;
	}

	public static void main(String[] args) {
		
		//System.out.println(somar(6, 9));;
		
		int valorSoma = somar(6, 632);
		System.out.println(valorSoma);
	}

}
