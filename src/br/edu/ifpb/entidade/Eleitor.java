package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_eleitor")
@NamedQuery(name = "Eleitor.getAll", query = "from Eleitor")
public class Eleitor extends Pessoa{
	

}
