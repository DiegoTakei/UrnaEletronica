package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_eleitor")
@NamedQuery(name = "Eleitor.getAll", query = "from Eleitor")

public class Eleitor extends Pessoa {
	
	@Column(name = "titulo_pessoa", unique = true)
	private String tituloVotacao;

	public String getTituloVotacao() {
		return tituloVotacao;
	}

	public void setTituloVotacao(String tituloVotacao) {
		this.tituloVotacao = tituloVotacao;
	}
	

}
