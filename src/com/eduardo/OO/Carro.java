package com.eduardo.OO;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("O carro tem autonomia de " + capCombustivel * consumoCombustivel + " kms.");
	}
}

