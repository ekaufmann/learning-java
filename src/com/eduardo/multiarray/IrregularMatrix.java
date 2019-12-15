package com.eduardo.multiarray;

import java.util.Scanner;

public class IrregularMatrix {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão entrevistadas?");
		int pessoas = input.nextInt();
		
		String[][] filhos = new String[pessoas][];
		
		for (int i = 0; i < filhos.length; i++) {
			System.out.println("\nQuantos flhos a pessoa " + (i + 1) + " tem?");
			int qtdFilhos = input.nextInt();
			
			filhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < filhos[i].length; j++) {
				System.out.println("\nDigite o nome do filho " + (j + 1) + ":");
				String nomeFilho = input.next();
				
				filhos[i][j] = nomeFilho;
			}
		}
		
		for (int i = 0; i < filhos.length; i++) {
			System.out.println("\nEntrevistado " + (i + 1) + ":");
			
			for (int j = 0; j < filhos[i].length; j++) {
				System.out.println("Filho " + (j + 1) + ": " + (filhos[i][j]));
				
			}
		}
		
		input.close();
		
	}
}
