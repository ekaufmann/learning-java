package com.eduardo.OO.lampada;

public class LampadaTeste {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligarLampada();
		lampada.desligarLampada();
		lampada.ligarLampada();
		
		System.out.println("\nA lampada está ligada?");
		
		if (lampada.ligada) {
			System.out.println("Está ligada!");
		} else {
			System.out.println("Está desligada!");
		}
	}	
}
