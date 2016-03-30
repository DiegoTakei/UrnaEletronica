package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Sessao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_pessoa")
	private int id;
	
	@Column(name = "tb_sessao")
	private int sessao;
	
	@ManyToOne
	@Column(name = "tb_eleitor_FK")
	private Eleitor eleitor;
	
	@OneToOne
	@Column(name = "tb_urna_FK")
	private Urna urna;

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Urna getUrna() {
		return urna;
	}

	public void setUrna(Urna urna) {
		this.urna = urna;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSessao() {
		return sessao;
	}

	public void setSessao(int sessao) {
		this.sessao = sessao;
	}	
	

}
