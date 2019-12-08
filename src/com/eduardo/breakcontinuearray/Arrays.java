package com.eduardo.breakcontinuearray;

public class Arrays {
	
	public static void main (String[] args) {
		
		double[] temperaturas = new double[5];
		temperaturas[0] = 31;
		temperaturas[1] = 32.3;
		temperaturas[2] = 30.4;
		temperaturas[3] = 28.6;
		temperaturas[4] = 27;
		//temperaturas[5] = 29; exception ArrayIndexOutOfBoundsException
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print(temperaturas[i] + " ");
		}
		
		for (int j = 0; j < temperaturas.length; j++) {
			System.out.print(temperaturas[j] + " ");
			temperaturas[j] = j;
			System.out.println(temperaturas[j]);
		}
	}
}

