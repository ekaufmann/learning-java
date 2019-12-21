package com.eduardo.OO.aluno;

import java.util.Scanner;

public class Aluno {
	
	Scanner input = new Scanner(System.in);
	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[] notas = new double[3];
	
	void nomear() {
		System.out.print("Digite o nome do aluno: ");
		nome = input.next();
	}
	
	void informarMatricula() {
		System.out.print("Digite a matrícula: ");
		matricula = input.next();
	}
	
	void informarCurso() {
		System.out.print("Digite o curso: ");
		curso = input.next();
	}
	
	void informarDisciplinas() {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print("\nDigite a disciplina " + (i + 1) + ": ");
			disciplinas[i] = input.next();
			
			System.out.print("Digite a nota dessa disciplina: ");
			notas[i] = input.nextDouble();
			
			while (notas[i] < 0 || notas[i] > 10) {
				System.out.print("Nota inválida! Digite nota válida: ");
				notas[i] = input.nextDouble();
			}
		}
	}
	
	void preencher() {
		System.out.println("Digite as informações do aluno.\n");
		nomear();
		informarMatricula();
		informarCurso();
		informarDisciplinas();		
	}
	
	void verificarAprovacao() {
		System.out.println("\nO aluno " + nome + " matriculado em " + curso + " obteve o seguinte resultado:");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%s: %.2f - ", disciplinas[i], notas[i]);
			
			if (notas[i] < 7) {
				System.out.println("Reprovado!");		
			} else {
				System.out.println("Aprovado!");
			}
		}
	}
	
}
