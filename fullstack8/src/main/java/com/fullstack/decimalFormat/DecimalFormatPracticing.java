package com.fullstack.decimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatPracticing {

	public static void main(String[] args) {

		String eua = "###,###.##";
		DecimalFormat df = new DecimalFormat(eua);		
		System.out.println("EUA " + df.format(1234567890.123));
		
		System.out.println();		

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');		

		String br = "###,###.##";
		df = new DecimalFormat(br, dfs);
		System.out.println("Brazil " + df.format(1234567890.123));

	}

}
