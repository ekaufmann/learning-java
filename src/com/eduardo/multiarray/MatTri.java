package com.eduardo.multiarray;

public class MatTri {
	
	public static void main (String[] args) {
		
		int[][][] tri = new int[3][3][3];
		int soma = 0, pares = 0, impares = 0;
		
		for (int i = 0; i < tri.length; i++) {
			for (int j = 0; j < tri[i].length; j++) {
				for (int k = 0; k < tri[i][j].length; k++) {
					tri[i][j][k] = i + j + k;
				}
			}
		}
		
		for (int i = 0; i < tri.length; i++) {
			for (int j = 0; j < tri[i].length; j++) {
				for (int k = 0; k < tri[i][j].length; k++) {
					soma += tri[i][j][k];
										
					if (tri[i][j][k] % 2 == 0) {
						pares += tri[i][j][k];
					} else {
						impares += tri[i][j][k];
					}
				}
			}
		}
		
		System.out.printf("Soma total = %d\nSoma pares = %d\nSoma ímpares = %d\n", soma, pares, impares);
	}
}

