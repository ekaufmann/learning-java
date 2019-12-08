package com.eduardo.breakcontinue;

import java.util.Scanner;

public class breakCont {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inicial e outro final: ");
		int num = input.nextInt(), max = input.nextInt();
		
		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				System.out.println("Valor = " + i);
				break;
			}
		}
		
		input.close();
	}
}

