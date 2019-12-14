package com.eduardo.multiarray;


public class Matrices {
	
	public static void main (String[] args) {
		
		double[][] notas = new double[5][4]; // [lines][columns]
		
		notas[0][0] = 10;
		notas[0][1] = 8.6;
		notas[0][2] = 6.7;
		notas[0][3] = 8;
		
		notas[1][0] = 9;
		notas[1][1] = 8.2;
		notas[1][2] = 7.4;
		notas[1][3] = 8.5;
		
		for (int i = 0; i < notas.length; i++) {
			//System.out.print(notas[i] + " "); // This prints the memory position of each element.
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
}

