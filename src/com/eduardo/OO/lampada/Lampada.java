package com.eduardo.OO.lampada;

public class Lampada {
	
	String marca;
	String tensao;
	double preco;
	int potencia; // Watts
	boolean ligada;
	
	void ligarLampada() {
		System.out.println("Ligou a lampada.");
		ligada = true;
	}
	
	void desligarLampada() {
		System.out.println("Desligou a lampada.");
		ligada = false;
	}
}
