package com.eduardo.OO.agenda;

public class Teste {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Nome 1");
		//contato.setEndereco("Endereço 1");
		//contato.setTelefone("00 99999-9999");
		
		/*
		 * Relacionamento tem-um.
		 * classe endereço;
		 */
		Endereco end = new Endereco();
		end.setNomeRua("Rua 1");
		end.setNumeroCasa("001");
		end.setComplemento("-");
		end.setCidade("Cidade 1");
		end.setEstado("Estado 1");
		end.setCep("00001001");
		
		/*
		 * Relacionamento tem-um.
		 * classe telefone;
		 */
		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("00");
		tel.setNumero("99999-9999");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Casa");
		tel2.setDdd("00");
		tel2.setNumero("2222-2222");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		// define os objetos em contato;
		contato.setEndereco(end);
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);

		
		System.out.println(contato.getNome());
		// Mostra o endereço de memória
		//System.out.println(contato.getEndereco());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone telefone : contato.getTelefones()) {
				//System.out.println(contato.getTelefones().getDdd() + " " + contato.getTelefones().getNumero());
				System.out.println(telefone.getDdd() + " " + telefone.getNumero());
			}
		}
	}
}
