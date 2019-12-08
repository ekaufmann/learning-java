package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q12 {
	
	public static void main (String[] args) {
		
		System.out.print("Digite a o valor da sua hora e a quantidade de horas mensais trabalhadas: ");
		Scanner input = new Scanner(System.in);
		double valor = input.nextDouble(), horas = input.nextDouble(), bruto, liquido, descontos;
		double ir, sind = 0.03, inss = 0.10, fgts = 0.11;
		bruto = valor * horas;
		
		if (bruto > 900 && bruto <= 1500) {
			ir = 0.05;
		} else if (bruto <= 2500) {
			ir = 0.10;
		} else {
			ir = 0.20;
		}
		
		descontos = (bruto * ir) + (bruto * sind) + (bruto * inss);
		liquido = bruto - descontos;
		
		System.out.printf("\nSalário bruto (%.2f * %.2f): R$ %.2f\n", valor, horas, bruto);
		System.out.printf("(-) IR (%.0f%%)           : R$ %.2f\n", (ir * 100), (bruto * ir));
		System.out.printf("(-) INSS (10%%)           : R$ %.2f\n", (bruto * inss));
		System.out.printf("(-) Sindicato (3%%)       : R$ %.2f\n", (bruto * sind));
		System.out.printf("(-) FGTS (11%%)           : R$ %.2f\n", (bruto * fgts));
		System.out.printf("Total de descontos: R$ %.2f\n", descontos);
		System.out.printf("Salário líquido: R$ %.2f\n", liquido);
		
		input.close();
	}
}

