package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_eleitor")
@NamedQuery(name = "Eleitor.getAll", query = "from Eleitor")

public class Eleitor extends Pessoa {
	
	@Column(name = "sessao_eleitor")
	private int sessao;

	public int getSessao() {
		return sessao;
	}

	public void setSessao(int sessao) {
		this.sessao = sessao;
	}
	
}
