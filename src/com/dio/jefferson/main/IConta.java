package com.dio.jefferson.main;

public interface IConta {

	double getSaldo();
	boolean sacar(double valor);
	boolean depositar(double valor);
	boolean transferir(double valor, Conta contaDestino);
}
