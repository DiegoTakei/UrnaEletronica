package br.edu.ifpb.entidade;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_voto")
@NamedQuery(name = "Voto.getAll", query = "from Voto")

public class Voto{
	
	@OneToOne
	@Column(name = "eleitor_FK")
	private Eleitor eleitor;
	
	@ManyToOne
	@Column(name = "candidato_FK")
	private Candidato candidato;
	
	@Column(name = "urna_FK")
	private Urna urna;
	
	@Column(name = "data")
	private Date data;

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Urna getUrna() {
		return urna;
	}

	public void setUrna(Urna urna) {
		this.urna = urna;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	

}
