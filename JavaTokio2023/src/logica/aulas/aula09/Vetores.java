package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
		String[] listafrutas = new String[4];
		
		listafrutas[0] = "kiwi";
		listafrutas[1] = "kiwi2";
		listafrutas[2] = "kiwi5";
		listafrutas[3] = "kiwi0";
		
		System.out.println("Fruta posição 1: " + listafrutas[1]);
		
		String[] listafrutas2 = {"manga", "maracujá", "pera", "imbu", "carambola"};
		
		int qtdfrutas = listafrutas2.length;
		System.out.println("Quantidade de frutas: " + qtdfrutas);
		
//		for(int i = 0; i < qtdfrutas; i++) {
//			System.out.println(listafrutas2[2]);
//		}
		
		int[] num = {0, 5, 6, 9};
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("Pos: %d -- Valor: %d \n", i, num[i]);
		}

	}

}
