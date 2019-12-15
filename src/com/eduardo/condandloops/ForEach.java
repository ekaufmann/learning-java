package com.eduardo.condandloops;

import java.util.Random;

public class ForEach {
	
	public static void main(String[] args) {
		
		int[] notas = new int[6];
		
		Random random = new Random();
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for (int nota : notas) {
			System.out.print(nota + " ");
		}
		System.out.println();
		
	}
}
