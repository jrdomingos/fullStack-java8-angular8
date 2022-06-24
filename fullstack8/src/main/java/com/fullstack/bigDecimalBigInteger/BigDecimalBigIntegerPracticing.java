package com.fullstack.bigDecimalBigInteger;

import java.math.BigDecimal;

public class BigDecimalBigIntegerPracticing {
	

	public static void main(String[] args) {

		 double a = 0.03;
		 double b = 0.04;
		 double c = b - a;
		 
		 System.out.println(c);		 
		 System.out.println();
		 
		 BigDecimal _a = new BigDecimal("0.03");
		 BigDecimal _b = new BigDecimal("0.04");
		 BigDecimal _c = _b.subtract(_a);
		 
		 System.out.println(_c);
		 System.out.println();
		 
		 
		 BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
		 BigDecimal bd2 = new BigDecimal("987654321.9876543210");
		 System.out.println(bd1.add(bd2));
		 
		 System.out.println();
		 
		 System.out.println(bd1.multiply(bd2));
		 
		 
		 
		 
		 
	}

}
