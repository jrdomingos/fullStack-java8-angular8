package com.fullstack.localTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class LocalTimePraticing {

	public static void main(String[] args) {
		
		LocalTime hagora = LocalTime.now();
		System.out.println(hagora);
		
		System.out.println();
		
		System.out.println(LocalTime.of(20, 54));
		
		System.out.println();
		
		System.out.println(LocalTime.parse("18:58:32"));
		
		System.out.println();
		
		System.out.println(hagora.plusMinutes(60));
		
		System.out.println();
		
		System.out.println(hagora.minus(37, ChronoUnit.MINUTES));
		
		System.out.println();		
		
		//data completa
		LocalDateTime datahoracompleta = LocalDateTime.now();
		
		System.out.println(datahoracompleta);
		
		System.out.println();
		
		System.out.println(LocalDateTime.parse("2022-06-06T08:43:29.260"));
		
		System.out.println();
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		System.out.println();
		
		Set<String>fusos = ZoneId.getAvailableZoneIds();
		
		for(String f: fusos) {
			System.out.println(f);
		}
		
		
		
		
		

	}

}





































