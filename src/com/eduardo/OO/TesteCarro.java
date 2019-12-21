package com.eduardo.OO;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println(autonomia);
		System.out.println(van.obterAutonomia());
		
		double qtdCombustivel10 = van.calcularCombustivel(10), qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("São necessários " + qtdCombustivel10 + "l para 10km e " + qtdCombustivel15 + "l para 15km!");
		/*
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		*/
	}
}
