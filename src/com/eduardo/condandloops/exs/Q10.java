package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q10 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe o seu turno de estudo:");
		System.out.println("M-Matutino, V-Vespertino, N-Noturno\n");
		
		Scanner input = new Scanner(System.in);
		String turno = input.next().toUpperCase();
		String texto;
		
		switch(turno) {
			case "M": texto = "Bom dia!"; break;
			case "V": texto = "Boa tarde!"; break;
			case "N": texto = "Boa noite!"; break;
			default: texto = "Valor inválido!";			
		}
		
		System.out.println("\n" + texto);
		
		input.close();
	}	
}
