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
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("Está ligada!");
		} else {
			System.out.println("Está desligada!");
		}
	}
	
	void mudarEstado() {
		if (ligada) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}
}
