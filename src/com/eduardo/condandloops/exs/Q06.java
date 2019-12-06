package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q06 {
	
	public static void main(String[] args) {
		
		System.out.println("Digite trẽs números:");
		Scanner input = new Scanner(System.in);
		double maior, n1 = input.nextDouble(), n2 = input.nextDouble(), n3 = input.nextDouble();
		
		maior = Math.max(n1, n2);
		maior = Math.max(maior, n3);
		
		System.out.printf("Entre os números %.2f, %.2f e %.2f, o maior é o %.2f.\n", n1, n2, n3, maior);
		
		input.close();
	}
	
}
