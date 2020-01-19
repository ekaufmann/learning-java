package com.eduardo.OO.agenda2;

public class Agenda {
	
	private String nomeAgenda;
	Contato[] contatos;
	
	// getters e setters do nome;
	public String getNomeAgenda() {
		return this.nomeAgenda;
	}
	
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	// getters e setters do contato;
	public Contato[] getContatos() {
		return this.contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
}
