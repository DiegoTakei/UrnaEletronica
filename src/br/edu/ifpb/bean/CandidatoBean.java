package br.edu.ifpb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.entidade.Candidato;

@RequestScoped	
@ManagedBean
public class CandidatoBean {
	
	private Candidato candidato;
	
	public CandidatoBean() {
		
		this.candidato = new Candidato();		
	}
	
	public void cadastrarCandidato(){
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.insert(candidato);
	}
	
	public void deletarCandidato(){
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.delete(candidato);
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}