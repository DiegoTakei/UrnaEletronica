package br.edu.ifpb.entidade;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_votacao")
@NamedQuery(name = "Votacao.getAll", query = "from Votacao")
public class Votacao {
	
 private Voto voto;
 
}
