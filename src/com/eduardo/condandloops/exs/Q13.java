package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q13 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("\nDigite um número de 1 a 7: ");
		int num = input.nextInt();
		String dia;
		
		switch(num) {
			case 1: dia = "Domingo"; break;
			case 2: dia = "Segunda-feira"; break;
			case 3: dia = "Terça-feira"; break;
			case 4: dia = "Quarta-feira"; break;
			case 5: dia = "Quinta-feira"; break;
			case 6: dia = "Sexta-feira"; break;
			case 7: dia = "Sábado"; break;
			default: dia = "Valor inválido";
		}
		
		if (7 < num || num < 1) {
			System.out.println("\n" + dia);
		} else {
			System.out.println("\nO valor informado foi " + num + " que corresponde ao dia: " + dia + " .");
		}
		
		input.close();
	}
}

