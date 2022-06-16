package com.fullstack.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {

		System.out.println("Locale Atual " + Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

		System.out.println("Pega texto do arquivo : " + rb.getString("hello"));

		// Obs: o arquivo não pode ficar dentro do mesmo pacote ou folders tem
		// que ficar no package main

	}

}
