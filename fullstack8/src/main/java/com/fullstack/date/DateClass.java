package com.fullstack.date;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {

		Date hoje = new Date();		
		System.out.println(hoje);
		System.out.println();
		System.out.println("Milisegundos desde jan 1970 " + hoje.getTime());
	}

}
