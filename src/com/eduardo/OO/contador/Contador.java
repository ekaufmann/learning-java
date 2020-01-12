package com.eduardo.OO.contador;

public class Contador {
	
	private static int conta;
	
	// Constructors
	public Contador() {
		conta = 0;
	}

	public Contador(int contador) {
		conta = contador;
	}
	
	// Methods
	static int getContador() {
		return conta;
	}
	
	static void setContador(int contador) {
		conta = contador;
	}
	
	static void incrementarContador() {
		conta++;
	}
	
	static void zerarContador() {
		conta = 0;
	}
}
