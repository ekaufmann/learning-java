package com.eduardo.condandloops.exs;

import java.util.Scanner;
import java.util.Arrays;

public class Q09 {
	
	public static void main(String[] args) {
		
		System.out.println("Digite trẽs números inteiros:");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();
		int[] lista = {n1, n2, n3};
		
		System.out.println("\nOs números digitados foram:");
		
		Arrays.sort(lista);
		
		for(int i = 0; i < lista.length; i++){
			System.out.print(lista[i] + " ");
		}
		
		System.out.println("\n");
		
		input.close();		
		
	}
}
