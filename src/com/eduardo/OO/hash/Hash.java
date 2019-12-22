package com.eduardo.OO.hash;

public class Hash {
	
	char[][] tabuleiro = new char[3][3];
	int jogadas = 1;
	
	boolean validaJogador() {
		if (jogadas % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean validarEscolha(int linha, int coluna, char sinal) {
		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			return false;
		} else {
			tabuleiro[linha][coluna] = sinal;
			jogadas++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	boolean verificarHorizontal(char sinal) {
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][0] == sinal && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
				return true;
			}		
		}
		return false;
	}
	
	boolean verificarVertical(char sinal) {
		for (int i = 0; i < tabuleiro[0].length; i++) {
			if (tabuleiro[0][i] == sinal && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
				return true;
			}
		}
		return false;
	}
	
	boolean verificarDiagonal(char sinal) {
		if (tabuleiro[0][0] == sinal && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
			return true;
		} else if (tabuleiro[0][2] == sinal && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean verificarGanhador(char sinal) {
		if (verificarHorizontal(sinal) || verificarVertical(sinal) || verificarDiagonal(sinal)) {
			return true;
		} else {
			return false;
		}
	}
	
}
