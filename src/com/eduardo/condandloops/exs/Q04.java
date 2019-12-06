package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		String letra = input.next();
		
		switch(letra) {
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U": System.out.printf("A letra %s é uma vogal.\n", letra); break;
			default: System.out.printf("A letra %s não é uma vogal.\n", letra); break;
		}
		
		input.close();
	
	}
	
}
