package com.fullstack.calendar;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // singlenton

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
