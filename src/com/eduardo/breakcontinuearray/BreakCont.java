package com.eduardo.breakcontinuearray;

import java.util.Scanner;

public class BreakCont {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inicial e outro final: ");
		int num = input.nextInt(), max = input.nextInt();
		
		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				System.out.println("Valor de parada = " + i);
				break;
			}
			
			if (i % 2 == 0) {
				System.out.println("Valor de continuação = " + i);
				continue;
			}
		}
		
		input.close();
	}
}

