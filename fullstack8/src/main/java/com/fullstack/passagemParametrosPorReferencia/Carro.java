package com.fullstack.passagemParametrosPorReferencia;

public class Carro {
	public Long id;
	public int ano;
	public String placa;

	public Carro() {
	};

	public Carro(Long id, int ano, String placa) {
		this.id = id;
		this.ano = ano;
		this.placa = placa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", ano=" + ano + ", placa=" + placa + "]";
	}

}
