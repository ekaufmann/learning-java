package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q11 {
	
	public static void main (String[] args) {
		
		System.out.print("Digite seu salário atual: R$ ");
		Scanner input = new Scanner(System.in);
		double percentual, aumento, salario = input.nextDouble();
		
		if (salario <= 280) {
			percentual = 0.2;
		} else if (salario <= 700) {
			percentual = 0.15;
		} else if (salario <= 1500) {
			percentual = 0.1;
		} else {
			percentual = 0.05;
		}
		
		aumento = (percentual * salario) + salario;
		
		System.out.printf("Seu salário era de R$ %.2f\n", salario);
		System.out.printf("Seu reajuste será de %.0f%%\n", (percentual * 100));
		System.out.printf("Isso representa um aumento de %.2f.\n", (salario * percentual));
		System.out.printf("Logo, seu novo salário será R$ %.2f.", aumento);
		
		input.close();
	}
}

