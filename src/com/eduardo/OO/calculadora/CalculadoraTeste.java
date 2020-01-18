package com.eduardo.OO.calculadora;

import java.util.Scanner;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calculadora calcula = new Calculadora();
		double num1 = 0, num2 = 0;
		String acaba = "";
		char operator = 'a';
		boolean funciona = true;
		
		System.out.println("===== CALCULADORA =====\n");
		System.out.println("      " + "Res = " + calcula.getResultado());
		
		while (funciona) {
			num1 = selecionarOpcao(input, calcula); // Verifica se o resultado será usado na próxima operação.
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			
			operator = selecionarOperador(input, calcula, operator, num1, num2);
			System.out.print("\n      " + num1 + " " + operator + " " + num2 + " = ");
			System.out.println(calcula.getResultado() + "\n");
			
			funciona = finalizar(input, acaba);			
		
		}
		
		input.close();
	}
	
	public static double selecionarOpcao(Scanner input, Calculadora calcula) {
		double num = 0;
		System.out.println("\nUsar o resultado existente? S - Sim / N - Não");
		String escolha = input.next().toUpperCase();
		
		if(escolha.equals("S")) {
			num = calcula.getResultado();
		} else if(escolha.equals("N")) {
			System.out.print("Digite o primeiro número: ");
			num = input.nextDouble();
		} else {
			System.out.println("Opção inválida!!!");
		}
		return num;
	}
	
	public static char selecionarOperador(Scanner input, Calculadora calcula, char operator, double num1, double num2) {
		boolean aux = true;
		
		System.out.println("\nDigite a operação a ser realizada: ");
		System.out.println("Soma -> +;\nSubtração -> -;\nMultiplicação -> *;\nDivisão -> /;\nPotenciação -> p.");
		operator = input.next().charAt(0);
		
		while(aux) {
			aux = false;
			switch(operator) {
				case '+':
					calcula.somar(num1, num2);
					break;
				case '-':
					calcula.subtrair(num1, num2);
					break;
				case '*':
					calcula.multiplicar(num1, num2);
					break;
				case '/':
					calcula.dividir(num1, num2);
					break;
				case 'p': // circunflexo com problema hahha
					calcula.elevar(num1, num2);
					break;
				default:
					System.out.println("Opção inválida!");
					System.out.print("\nDigite a operação a ser realizada: ");
					operator = input.next().charAt(0);
					aux = true;
			}
		}
		return operator;
	}
	
	public static boolean finalizar(Scanner input, String acaba) {
		boolean aux = true;
		boolean retorno = true;
		while(aux){
			aux = false;
			System.out.println("Quer fazer outra operação? S - Sim / N - Não");
			acaba = input.next().toUpperCase();
			if(acaba.equals("N")) {
				System.out.println("Finalizando...");
				retorno = false;
			} else if (acaba.equals("S")) {
				System.out.println("Cotinuando...");
				retorno = true;
			} else {
				System.out.println("Opção inválida!!!");
				aux = true;
			}
		}
		return retorno;
	}
}
