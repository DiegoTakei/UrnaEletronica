package br.edu.ifpb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.entidade.Eleitor;

@RequestScoped	
@ManagedBean
public class EleitorBean {
	
	private Eleitor eleitor;
	private String index = "index.xhtml?faces-redirect=true&includeViewParams=true";
	
	public EleitorBean() {
		
		this.eleitor = new Eleitor();		
	}
	
	public String cadastrarEleitor() throws IOException{
		
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.insert(eleitor);
		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		
		return index;
	}
	
	public String deletarEleitor(){
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.delete(eleitor);
		
		return index;
	}
	
	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	
	

}
