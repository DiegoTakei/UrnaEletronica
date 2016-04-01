package br.edu.ifpb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.entidade.Eleitor;

@RequestScoped	
@ManagedBean
public class EleitorBean {
	
	private Eleitor eleitor;
	
	public EleitorBean() {
		
		this.eleitor = new Eleitor();		
	}

	public void cadastrarEleitor(){
		
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.insert(eleitor);
	}
	
	public void deletarEleitor(){
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.delete(eleitor);
	}
	
	
	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	
	

}
