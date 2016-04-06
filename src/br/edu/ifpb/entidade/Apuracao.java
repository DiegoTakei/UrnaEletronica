package br.edu.ifpb.entidade;


public class Apuracao {
	
	
	private int id;
	
	private int qnt_votos;

	private int qnt_brancos;
	
	private int qnt_nulos;
	
	private int qnt_ausentes;
	
	private Candidato prefeito_mais_votado;
	
	private Candidato governador_mais_votado;
	
	private Candidato presidente_mais_votado;
	
	private Candidato prefeito_menos_votado;
	
	private Candidato governador_menos_votado;
	
	private Candidato presidente_menos_votado;
	
	private Candidato prefeito_eleito;
	
	private Candidato governador_eleito;
	
	private Candidato presidente_eleito;
	
	
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
	
	public Candidato getPrefeito_mais_votado() {
		return prefeito_mais_votado;
	}

	public void setPrefeito_mais_votado(Candidato prefeito_mais_votado) {
		this.prefeito_mais_votado = prefeito_mais_votado;
	}

	public Candidato getGovernador_mais_votado() {
		return governador_mais_votado;
	}

	public void setGovernador_mais_votado(Candidato governador_mais_votado) {
		this.governador_mais_votado = governador_mais_votado;
	}

	public Candidato getPresidente_mais_votado() {
		return presidente_mais_votado;
	}

	public void setPresidente_mais_votado(Candidato presidente_mais_votado) {
		this.presidente_mais_votado = presidente_mais_votado;
	}

	public Candidato getPrefeito_menos_votado() {
		return prefeito_menos_votado;
	}

	public void setPrefeito_menos_votado(Candidato prefeito_menos_votado) {
		this.prefeito_menos_votado = prefeito_menos_votado;
	}

	public Candidato getGovernador_menos_votado() {
		return governador_menos_votado;
	}

	public void setGovernador_menos_votado(Candidato governador_menos_votado) {
		this.governador_menos_votado = governador_menos_votado;
	}

	public Candidato getPresidente_menos_votado() {
		return presidente_menos_votado;
	}

	public void setPresidente_menos_votado(Candidato presidente_menos_votado) {
		this.presidente_menos_votado = presidente_menos_votado;
	}

	public Candidato getPrefeito_eleito() {
		return prefeito_eleito;
	}

	public void setPrefeito_eleito(Candidato prefeito_eleito) {
		this.prefeito_eleito = prefeito_eleito;
	}

	public Candidato getGovernador_eleito() {
		return governador_eleito;
	}

	public void setGovernador_eleito(Candidato governador_eleito) {
		this.governador_eleito = governador_eleito;
	}

	public Candidato getPresidente_eleito() {
		return presidente_eleito;
	}

	public void setPresidente_eleito(Candidato presidente_eleito) {
		this.presidente_eleito = presidente_eleito;
	}

	public Candidato getCandidatos_segundo_turno() {
		return candidatos_segundo_turno;
	}

	public void setCandidatos_segundo_turno(Candidato candidatos_segundo_turno) {
		this.candidatos_segundo_turno = candidatos_segundo_turno;
	}

}
