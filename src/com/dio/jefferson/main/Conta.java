package com.dio.jefferson.main;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	

	protected int agencia;
	protected int numero;
	protected double saldo = 0;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public boolean transferir(double valor, Conta conta) {
		
		if(sacar(valor)) {
			conta.depositar(valor);
			System.out.println("Operação realizada!\nDisponível na conta: "+getSaldo());
			return true;
		}
		System.out.println("Operação NÂO realizada!\nDisponível na conta: "+getSaldo());
		return false;		
	}
	
	@Override
	public boolean sacar(double valor) {
		
		if(valor<=getSaldo()) {
			this.saldo -= valor;
			System.out.println("Operação realizada!\nDisponível na conta: "+getSaldo());
			return true;
		}
		System.out.println("Operação NÂO realizada!\nDisponível na conta: "+getSaldo());
		return false;
	}
	
	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Operação realizada!");
			return true;
		}
		System.out.println("Operação NÂO realizada!\nDigite um valor válido.");
		return false;		
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]";
	}

	

	
}
