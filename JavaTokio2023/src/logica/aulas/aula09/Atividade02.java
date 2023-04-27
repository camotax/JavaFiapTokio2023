package logica.aulas.aula09;

public class Atividade02 {

	public static void main(String[] args) {
		
		
		int[][] matriz = new int[4][5];
		
		System.out.println(matriz[0].length); // mostra a quantidade de colunas
		System.out.println(matriz.length); // mostra a quantidade de linhas
		
		int linhas = matriz.length;
		int colunas = matriz[3].length;
		
		System.out.println("linhas: " + linhas);
		System.out.println("Colunas: " + colunas);
		
		for(int i = 0; i < linhas; i++) {
			//System.out.println(matriz[i]); // vai passando por cada linha
			
			for(int j = 0; j < colunas; j++) { // percorre colunas
				matriz[i][j] = 9;
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		

	}

}
