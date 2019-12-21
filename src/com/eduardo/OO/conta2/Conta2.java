package com.eduardo.OO.conta2;

public class Conta2 {
	
	String numeroConta, agencia;
	double saldo, limite, limiteAtual;
	boolean especial;
	
	boolean sacar(double saque) {
		if (saldo >= saque) {
			saldo -= saque;
			return true;
		} else {
			if (especial) {
				if(limiteAtual > 0 && (saldo + limiteAtual) > saque) {
					saldo -= saque;
					limiteAtual += saldo;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
	void depositar(double deposito) {
		if (limiteAtual < limite) {
			if (deposito <= (limite - limiteAtual)) {
				limiteAtual += deposito;
			} else {
				limiteAtual += (limite - limiteAtual);
				deposito += (limiteAtual - limite);
				saldo += deposito;
			}
		} else {
			saldo += deposito;
		}
	}
	
	void mostrarSaldo() {
		System.out.println("Seu saldo = " + saldo);
	}
	
	boolean verificaCheque() {
		return saldo < 0;
	}
}
