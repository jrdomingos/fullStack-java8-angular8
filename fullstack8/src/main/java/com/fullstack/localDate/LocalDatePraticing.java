package com.fullstack.localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDatePraticing {

	public static void main(String[] args) {

		LocalDate agora = LocalDate.now();

		System.out.println(agora);

		System.out.println();

		System.out.println(LocalDate.of(2022, 6, 5));

		System.out.println();

		System.out.println(LocalDate.parse("2022-06-05"));

		System.out.println();

		System.out.println(agora.plusDays(30)); // add days

		System.out.println();

		System.out.println(agora.minus(1, ChronoUnit.MONTHS));

		System.out.println();

		System.out.println(agora.getDayOfWeek());

	}

}
