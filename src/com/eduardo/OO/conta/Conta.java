package com.eduardo.OO.conta;

import java.util.Scanner;

public class Conta {
	
	Scanner input = new Scanner(System.in);
	String numeroConta;
	String agencia;
	String acao;
	double saldo, limiteAtual, limiteOriginal, aux;
	boolean especial;
	
	void sacar(double saque) {
		
		if (saque < saldo) {
			System.out.println("\nSaldo = " + saldo);
			saldo -= saque;
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Valor sacado = " + saque);
			System.out.println("Saldo atual = " + saldo);
				
		} else if (saque < (saldo + limiteAtual)) {
			System.out.println("Saldo da conta = " + saldo);
			System.out.println("Quer utilizar o cheque especial? S-Sim ou N-Não");
			acao = input.next().toUpperCase();
			
			if (acao.equals("S")) {
				aux = saque - saldo;
				System.out.println("Uso do limite autorizado.\n\nSeu limite atual é " + limiteAtual);
				System.out.printf("Será usado R$ %.2f do limite de R$ %.2f.\n", aux, limiteAtual);
				
				saldo = 0;
				limiteAtual -= aux;				
				
				System.out.println("\nSaque realizado com sucesso!");
				System.out.println("Valor sacado = " + saque);
				System.out.println("Saldo atual = " + saldo);
				System.out.println("Limite restante = " + limiteAtual);
			} else {
				System.out.println("Uso do limite não autorizado!");
			}
			
		} else {
			System.out.println("Saldo insuficiente!");
			System.out.println("Saldo = " + saldo);
			System.out.println("Valor de saque = " + saque);
		}
	}
	
	void depositar(double deposito) {
		
		System.out.println("\nSaldo anterior = " + saldo);
		System.out.println("\nDepositou = " + deposito);
		
		if (limiteAtual < limiteOriginal) {
			aux = limiteOriginal - limiteAtual;
			System.out.printf("\nÉ necessário repor R$ %.2f de cheque especial.\n", aux);
			
			limiteAtual += aux;
			System.out.println("Limite = " + limiteAtual);
			
			deposito -= aux;
			saldo += deposito;
			System.out.println("Saldo = " + saldo);
		} else {
			saldo += deposito;
			System.out.println("Saldo = " + saldo);
		}
	}	
}
