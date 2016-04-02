package br.edu.ifpb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class IndexBean {
	
	public void toCadastrarEleitor() throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("cadastro-eleitor.xhtml");
	}
	
	public void toCadastrarCandidato() throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("cadastro-candidato.xhtml");
	}
	
	public void toIndex() throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
	}
}
