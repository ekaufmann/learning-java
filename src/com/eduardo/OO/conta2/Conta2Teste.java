package com.eduardo.OO.conta2;

public class Conta2Teste {
	
	public static void main(String[] args) {
		
		Conta2 conta = new Conta2();
		
		conta.numeroConta = "1234";
		conta.agencia = "0001";
		conta.saldo = 250;
		conta.especial = true;
		conta.limite = 400;
		conta.limiteAtual = conta.limite;
		
		System.out.println("A conta " + conta.numeroConta + " possui saldo igual " + conta.saldo + " e cheque especial de " + conta.limite);
		
		double valorSaque = 300;
		boolean saqueEfetuado = conta.sacar(valorSaque);		
		if (saqueEfetuado) {
			System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
			System.out.println("Saldo = " + conta.saldo);
			
			if (conta.especial) {
				System.out.println("Cheque especial = " + conta.limiteAtual);
			}
		} else {
			System.out.println("Saque inválido!");
		}
		
		double qtdDeposito = 200;
		conta.depositar(qtdDeposito);
		System.out.println("Deposito de " + qtdDeposito + " realizado!");
		System.out.println("Saldo = " + conta.saldo);
		if (conta.especial) {
			System.out.println("Cheque especial = " + conta.limiteAtual);
		}
		
		conta.mostrarSaldo();
		
		if (conta.verificaCheque()) {
			System.out.println("Está usando cheque especial.");
		} else {
			System.out.println("Não está usando cheque especial.");
		}

	}
}
