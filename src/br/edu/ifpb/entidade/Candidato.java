package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_candidato")
@NamedQuery(name = "Candidato.getAll", query = "from Candidato")

public class Candidato extends Eleitor {
	
	@Column(name = "numero_candidato")
	private int numero;
	
	@Column(name = "cargo_candidato")
	private String cargo;
	
	@Column(name = "num_votos")
	private int numVotos;
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getNumVotos() {
		return numVotos;
	}

	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
	

}
