package com.fullstack.numerosAleatoriosRandom;

import java.util.Random;

public class RandomPracticing {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 100));

		System.out.println();

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());

		System.out.println();

		System.out.println(aleatorio.nextInt(100));

	}

}
