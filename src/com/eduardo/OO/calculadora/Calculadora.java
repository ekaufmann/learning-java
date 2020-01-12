package com.eduardo.OO.calculadora;

public class Calculadora {
	
	private double resultado;
	
	public Calculadora() {
		resultado = 0;
	}
	
	public double getResultado() {
		return resultado;
	}
	
	public void somar(double num1, double num2) {
		resultado = num1 + num2;
	}
	
	public void subtrair(double num1, double num2) {
		resultado = num1 - num2;
	}
	
	public void multiplicar(double num1, double num2) {
		resultado = num1 * num2;
	}
	
	public void dividir(double num1, double num2) {
		resultado = num1 / num2;
	}
	
	public void elevar(double num1, double num2) {
		resultado = Math.pow(num1, num2);
	}
	
}
