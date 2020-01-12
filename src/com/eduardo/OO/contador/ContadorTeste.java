package com.eduardo.OO.contador;

public class ContadorTeste {
	
	public static void main(String[] args) {
	
		Contador conta1 = new Contador();
		Contador conta2 = new Contador();
		
		escolherOpcao(conta1, 1);
		escolherOpcao(conta2, 2);
		escolherOpcao(conta1, 1);
		
		for(int i = 0; i < 3; i++) {
			escolherOpcao(conta1, 2);
		}
		
		escolherOpcao(conta2, 1);
		escolherOpcao(conta1, 5);
		escolherOpcao(conta2, 3);
		escolherOpcao(conta1, 1);
		
	}

	public static void escolherOpcao(Contador conta, int opcao) {
		
		/*System.out.println("Escolha uma das opções abaixo");
		System.out.println("1 - Ver contador;\n2 - Incrementar;\n3 - Zerar;");*/
		
		switch(opcao) {
			case 1:
				System.out.println("Contador = " + conta.getContador());
				break;
			case 2:
				conta.incrementarContador();
				System.out.println("Contador incrementado.");
				break;
			case 3:
				conta.zerarContador();
				System.out.println("Contador zerado.");
				break;
			default:
				System.out.println("Valor incorreto.");
		}
	}
	
}
