package br.edu.ifpb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.entidade.Candidato;

@RequestScoped	
@ManagedBean
public class CandidatoBean {
	
	private Candidato candidato;
	private String index = "index.xhtml?faces-redirect=true&includeViewParams=true";
	
	public CandidatoBean() {
		
		this.candidato = new Candidato();		
	}
	
	public String cadastrarCandidato() throws IOException{
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.insert(candidato);
		return index;
	}
	
	public String deletarCandidato() throws IOException{
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.delete(candidato);
		
		return index;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}