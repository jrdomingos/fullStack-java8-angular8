package com.fullstack.numberFormat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatPracticing {

	public static void main(String[] args) {

		// Obs: sem precisão decimal, senão usar Decimal Format
		// 1.000,00 - Brasil
		// 1,000.00 - EUA

		Locale en = new Locale("en", "United States");
		NumberFormat nf = NumberFormat.getInstance(en);

		String num = nf.format(100.99);
		System.out.println(num);

		System.out.println();

		Locale br = new Locale("pt", "Brazil");
		NumberFormat nfb = NumberFormat.getInstance(br);

		String numbr = nfb.format(100.99);
		System.out.println(numbr);

		System.out.println();

		// -----------------------------------------------//
		// Moeda

		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String valor = moeda.format(100.99);
		System.out.println(valor);

		System.out.println();

		Currency currency = moeda.getCurrency();
		System.out.println(currency);

		System.out.println();

		// -----------------------------------------------//
		// Porcentagem

		NumberFormat percent = NumberFormat.getPercentInstance();
		String porcentagem = percent.format(99.987);
		System.out.println(porcentagem);

		// pode também configurar máximo ou minimo de casas decimais após virgula
		// verificar aula 96

	}

}
