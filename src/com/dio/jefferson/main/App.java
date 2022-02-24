package com.dio.jefferson.main;

public class App {

	public static void main(String[] args) {

		Cliente clienteC = new Cliente("Jefferson");
		Cliente clienteP = new Cliente("Marcos");
		
		Conta contaC = new ContaCorrente(clienteC);
		
		Conta contaP = new ContaPoupanca(clienteP);
		
		contaC.depositar(100);
		contaC.transferir(50, contaP);
		
		

		System.out.println(contaC+"\n"+contaP);
	}

}
