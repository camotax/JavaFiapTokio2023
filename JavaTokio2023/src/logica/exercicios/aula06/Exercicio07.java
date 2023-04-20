package logica.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Considere a = 5, b = 7, c = 4 e d = 8
			▪ Julgue verdadeiro ou falso as seguintes expressões:

			A. (a <= b) e (b < d)
			B. (a = b) ou (c != b)
			C. (d > a) e (c >= b)
			D. (a <= b) ou (c <= d)
			E. ((b > c) ou (c < a)) e (d <= b)*/
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		System.out.println(a <= b && b < d);
		System.out.println((a == b) || (c != b));
		System.out.println(d > a && c >= b);
		System.out.println((a <= b) || (c <= d));
		System.out.println((b > c) || (c < a) && (d <= b));
		

	}

}
