package logica.aulas.aula09;

public class RevVetores {

	public static void main(String[] args) {
		
		int[] numeros = {10, 20, 30, 40};
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos: %d -- Valor: %d\n", i, numeros );
		}
		
		// DIFERENTE
		
		for (int num: numeros) { // percorre automaticamente uma lista
			System.out.println(num);
		}
		
	}

}
