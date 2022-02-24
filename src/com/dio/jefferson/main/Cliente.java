package com.dio.jefferson.main;

public class Cliente {
	
	private  static int CODIGO = 1;

	private String nome;
	private int codigo;
	
	public Cliente(String nome) {
		this.codigo = CODIGO++;
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	
}
