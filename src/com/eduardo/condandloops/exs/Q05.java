package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite duas notas: ");
		double nota1 = input.nextDouble(), nota2 = input.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media == 10){
			System.out.println("Aprovado com distinção!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		input.close();
	}
}
