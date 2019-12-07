package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		
		System.out.println("Digite os preços para comparação:");
		Scanner input = new Scanner(System.in);
		double menor, preco1 = input.nextDouble(), preco2 = input.nextDouble(), preco3 = input.nextDouble();
		
		menor = Math.min(preco1, preco2);
		menor = Math.min(menor, preco3);
		
		System.out.printf("O produto de %.2f é o mais barato. Leve!\n", menor);
		
		input.close();
	
	}

}
