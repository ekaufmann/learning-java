package com.eduardo.OO;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	// a simple method without the return; sintax = void <method-name>() {};
	void exibirAutonomia() {
		System.out.println("O carro tem autonomia de " + capCombustivel * consumoCombustivel + " kms.");
	}
	
	// method with return; sintax = <type-of-return> <method-name>() {};
	double obterAutonomia() {
		System.out.println("Chamando o método obterAutonomia:");
		return capCombustivel * consumoCombustivel;
	}
	
	// method with parameters; sintax = <>type-of-return-or-void> <method-name>() {};
	double calcularCombustivel(double km) {
		//return km / consumoCombustivel;
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}

