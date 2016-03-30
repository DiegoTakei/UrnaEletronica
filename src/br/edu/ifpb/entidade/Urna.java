package br.edu.ifpb.entidade;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_urna")
@NamedQuery(name = "Urna.getAll", query = "from Urna")

public class Urna {
	
	

}
