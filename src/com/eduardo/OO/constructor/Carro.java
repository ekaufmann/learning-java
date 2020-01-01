package com.eduardo.OO.constructor;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro() {}
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("3 parametros.");
	}
	
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("2 parametros.");
	}
	
	// a simple method without the return; sintax = void <method-name>() {};
	void exibirAutonomia() {
		System.out.println("O carro tem autonomia de " + this.capCombustivel * this.consumoCombustivel + " kms.");
	}
	
	// method with return; sintax = <type-of-return> <method-name>() {};
	double obterAutonomia() {
		System.out.println("Chamando o método obterAutonomia:");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	// method with parameters; sintax = <>type-of-return-or-void> <method-name>() {};
	double calcularCombustivel(double km) {
		//return km / consumoCombustivel;
		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}
}

