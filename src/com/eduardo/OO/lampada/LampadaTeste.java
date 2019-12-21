package com.eduardo.OO.lampada;

public class LampadaTeste {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.mudarEstado();
		lampada.mudarEstado();
		lampada.mudarEstado();
		
		System.out.println("\nA lampada está ligada?");
		lampada.mostrarEstado();
		
	}	
}
