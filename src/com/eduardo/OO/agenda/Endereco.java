package com.eduardo.OO.agenda;

public class Endereco {
	
	private String nomeRua;
	private String numeroCasa;
	private String complemento;
	private String cidade;
	private String estado;
	private String cep;
	
	// getter e setter nome da rua;
	public String getNomeRua() {
		return this.nomeRua;
	}
	
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	
	// getter e setter número da casa;
	public String getNumeroCasa() {
		return this.numeroCasa;
	}
	
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	// getter e setter complemento;
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	// getter e setter cidade;
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	// getter e setter estado;
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	// getter e setter CEP;
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
}
