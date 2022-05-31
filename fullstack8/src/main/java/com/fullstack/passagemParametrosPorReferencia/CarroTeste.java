package com.fullstack.passagemParametrosPorReferencia;

public class CarroTeste {

	public static void main(String[] args) {

		Carro nc = new Carro(1L, 1974, "BQ8054");
		mudarAnoCarro(nc);
		
		System.out.println(nc);

	}

	public static void mudarAnoCarro(Carro carro) {
		carro.ano = carro.ano + 4;
	}

}
