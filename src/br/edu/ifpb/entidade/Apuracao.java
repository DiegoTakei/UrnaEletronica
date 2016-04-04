package br.edu.ifpb.entidade;


public class Apuracao {
	
	
	private int id;
	
	private int qnt_votos;

	private int qnt_brancos;
	
	private int qnt_nulos;
	
	private int qnt_ausentes;
	
	private Candidato candidato_mais_votado;
	
	
	private Candidato candidato_menos_votado;
	
	
	private Candidato candidato_eleito;
	
	
	private Candidato candidatos_segundo_turno;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQnt_votos() {
		return qnt_votos;
	}

	public void setQnt_votos(int qnt_votos) {
		this.qnt_votos = qnt_votos;
	}

	public int getQnt_brancos() {
		return qnt_brancos;
	}

	public void setQnt_brancos(int qnt_brancos) {
		this.qnt_brancos = qnt_brancos;
	}

	public int getQnt_nulos() {
		return qnt_nulos;
	}

	public void setQnt_nulos(int qnt_nulos) {
		this.qnt_nulos = qnt_nulos;
	}

	public int getQnt_ausentes() {
		return qnt_ausentes;
	}

	public void setQnt_ausentes(int qnt_ausentes) {
		this.qnt_ausentes = qnt_ausentes;
	}

	public Candidato getCandidato_mais_votado() {
		return candidato_mais_votado;
	}

	public void setCandidato_mais_votado(Candidato candidato_mais_votado) {
		this.candidato_mais_votado = candidato_mais_votado;
	}

	public Candidato getCandidato_menos_votado() {
		return candidato_menos_votado;
	}

	public void setCandidato_menos_votado(Candidato candidato_menos_votado) {
		this.candidato_menos_votado = candidato_menos_votado;
	}

	public Candidato getCandidato_eleito() {
		return candidato_eleito;
	}

	public void setCandidato_eleito(Candidato candidato_eleito) {
		this.candidato_eleito = candidato_eleito;
	}

	public Candidato getCandidatos_segundo_turno() {
		return candidatos_segundo_turno;
	}

	public void setCandidatos_segundo_turno(Candidato candidatos_segundo_turno) {
		this.candidatos_segundo_turno = candidatos_segundo_turno;
	}

}
