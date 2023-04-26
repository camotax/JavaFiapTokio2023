package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		Date dt = new Date();
		
		System.out.println("Data agora: " + dt);
		
		Calendar c = Calendar.getInstance(); // utilizado atualmente
		
		System.out.println("Data e hora: " + c.getTime());
		
		System.out.println("Ano: " + c.get(Calendar.YEAR)); // MOSTRA SOMENTE O ANO
		System.out.println("Ano: " + c.get(Calendar.MONTH)); // MOSTRA SOMENTE O MÊS, COMEÇA DO 0 (VAI SER 1 MÊS ANTES SEMPRE)
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		

	}

}
