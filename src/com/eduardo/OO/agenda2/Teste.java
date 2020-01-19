package com.eduardo.OO.agenda2;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {	
	
		Scanner input = new Scanner(System.in);
		
		// objeto agenda
		Agenda agenda = new Agenda();
		System.out.print("Digite o nome da agenda: ");
		agenda.setNomeAgenda(input.nextLine());
		
		// objetos contato
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		
		// array de contatos
		Contato[] contatos = new Contato[3];
		contatos[0] = contato1;
		contatos[1] = contato2;
		contatos[2] = contato3;		
		
		for (int i = 0; i < contatos.length; i++) {
			System.out.println("\nDigite os dados do contato " + (i + 1));
			
			System.out.print("Nome: ");
			contatos[i].setNome(input.next());
			
			System.out.print("Telefone: ");
			contatos[i].setTelefone(input.next());
			
			System.out.print("E-mail: ");
			contatos[i].setEmail(input.next());
			
			System.out.println();
		}
		
		agenda.setContatos(contatos);
		
		System.out.println("===== " + agenda.getNomeAgenda() + ": =====\n");
		
		for (Contato contato : agenda.getContatos()) {
			System.out.println(contato.getNome());
			System.out.println(contato.getTelefone());
			System.out.println(contato.getEmail());
			System.out.println();
		}
		
		input.close();
	}
}
