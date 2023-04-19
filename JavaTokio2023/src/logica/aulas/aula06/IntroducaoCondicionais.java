package logica.aulas.aula06;

public class IntroducaoCondicionais {

	public static void main(String[] args) {
		
		// ESTRUTURA CONDICIONAL SIMPLES
		
		float nota1 = 4;
		
		if(nota1 < 6) {
			System.out.println(nota);
		}
		
		
		
		// ESTRUTURA CONDICIONAL COMPOSTA
		
			float nota2 = 5;
			
			if(nota2 < 6) {
				System.out.println("REPROVADO");
			}
			else {
				System.out.println("APROVADO");
			}
			
		//ESTRUTURA CONDICIONAL ENCADEADA
			
		float notafinal = 10;
		
		if(notafinal < 4) {
			System.out.println("REPROVADO");
		}
		else {
			if(notafinal < 6) {
				System.out.println("Recuperação");
			}
			else {
				System.out.println("APROVADO");
			}
		}
		
		// ESTRUTURA CONDICIONAL COMPOSTA - ELSE IF
		
		float notafinal2 = 10;
		
		if(notafinal2 < 4) {
			
			System.out.println("REPROVADO");
		}
		else if(notafinal < 6) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("APROVADO");
		}
				

	}

}
