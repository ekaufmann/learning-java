package com.eduardo.OO.hash;

import java.util.Scanner;

public class HashGame {
	
	static int escolha(String tipoEscolha, Scanner input) {
		int valor = 0;
		boolean valida = false;
		
		while (!valida) {
			System.out.print("Informe a " + tipoEscolha + " desejada: ");
			valor = input.nextInt();
			if(1 <= valor && valor <= 3) {
				valida = true;				
			} else {
				System.out.println("Valor inválido! Entre com valor entre 1 e 3.");
			}
		}
		valor--;
		return valor;		
	}
	
	public static void main(String[] args) {
		
		Hash jogo = new Hash();
		Scanner input = new Scanner(System.in);
		char sinal;
		int linha, coluna;
		boolean vitoria = false;
		
		System.out.println("\nJogador 1 = X\nJogador 2 = O");
		
		while (!vitoria) {
			if (jogo.validaJogador()) {
				System.out.println("\nJogador 1 - Escolha linha e coluna do tabuleiro (1 a 3):");
				sinal = 'X';
			} else {
				System.out.println("\nJogador 2 - Escolha linha e coluna do tabuleiro(1 a 3):");
				sinal = 'O';
			}
			
			linha = escolha("Linha", input);
			coluna = escolha("Coluna", input);
			
			if(!jogo.validarEscolha(linha, coluna, sinal)) {
				System.out.println("Jogada inválida, posição já foi preenchida.");
			}
			
			jogo.imprimirTabuleiro();
			
			if (jogo.verificarGanhador('X')) {
				System.out.println("Jogador 1 Ganhou!!!");
				vitoria = true;
			} else if (jogo.verificarGanhador('O')) {
				System.out.println("Jogador 2 Ganhou!!!");
				vitoria = true;	
			}else if (jogo.jogadas > 9) {
				System.out.println("O jogo acabou, não há vencedores");
				vitoria = true;
			}
		}		
	}	
}
