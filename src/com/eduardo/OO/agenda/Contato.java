package com.eduardo.OO.agenda;

public class Contato {
	
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	// getter e setter nome;
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// getter e setter endereço;
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// getter e setter telefone;
	public Telefone[] getTelefones() {
		return this.telefones;
	}
	
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}	
}
