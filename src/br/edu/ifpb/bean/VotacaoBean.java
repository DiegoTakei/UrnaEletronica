package br.edu.ifpb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.entidade.Eleitor;
import br.edu.ifpb.entidade.Voto;


@RequestScoped
@ManagedBean	
public class VotacaoBean {
	
	Eleitor eleitor;
	Voto voto;
	
	public VotacaoBean() {
		
		this.eleitor = new Eleitor();
		this.voto = new Voto();
	}

	public void verificarTitulo() throws IOException{
		EleitorDAO eleitorDAO = new EleitorDAO();
		Eleitor eleitor_aux = eleitorDAO.getByTitulo(eleitor.getTitulo_votacao());
		
		if(eleitor_aux!=null){
			FacesContext.getCurrentInstance().getExternalContext().redirect("votar.xhtml");
		}else{
			System.out.println("� nulo");
		}
	}
	
	public void votar(){
		
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Voto getVoto() {
		return voto;
	}

	public void setVoto(Voto voto) {
		this.voto = voto;
	}
	
	
	
	
}
	