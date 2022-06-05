package com.fullstack.calendarGregorian;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarGregorian {

	public static void main(String[] args) {		

		GregorianCalendar hoje = new GregorianCalendar();
		// System.out.println(hoje);

		printData(hoje);

	}

	private static void printData(Calendar hoje) {

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d ", dia, (mes + 1), ano);
		System.out.println();
		System.out.printf("Hora : %02d/%02d/%02d ", hora, minutos, segundos);

	}

}
