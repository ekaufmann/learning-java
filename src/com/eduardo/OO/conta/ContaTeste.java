package com.eduardo.OO.conta;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 130;
		conta1.limiteOriginal = 350;
		conta1.limiteAtual = conta1.limiteOriginal;
		conta1.especial = true;
		
		conta1.sacar(245);
		conta1.depositar(670);
		
	}
}
