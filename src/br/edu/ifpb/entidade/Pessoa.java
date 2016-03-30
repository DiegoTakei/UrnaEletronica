package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
@NamedQuery(name = "Pessoa.getAll", query = "from Pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_pessoa")
	private int id;
	
	@Column(name = "nome_pessoa")
	private String nome;
	
	@Column(name = "cpf_pessoa")
	private String cpf;
	
	@Column(name = "titulo_pessoa")
	private String titulo_votacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTitulo_votacao() {
		return titulo_votacao;
	}

	public void setTitulo_votacao(String titulo_votacao) {
		this.titulo_votacao = titulo_votacao;
	}
	
	
	
}