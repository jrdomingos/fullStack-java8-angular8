package com.fullstack.zoneID_ZoneDateTime;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDateTime {

	public static void main(String[] args) {
		
        System.out.println();
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		System.out.println("ZONE ID");
		
		Set<String>fusos = ZoneId.getAvailableZoneIds();
		
		for(String f: fusos) {
			System.out.println(f);
		}
		
	      	/////ZONE ID DATE TIME
		
	}

}
