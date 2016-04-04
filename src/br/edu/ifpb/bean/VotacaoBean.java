package br.edu.ifpb.bean;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.dao.VotoDAO;
import br.edu.ifpb.entidade.Candidato;
import br.edu.ifpb.entidade.Eleitor;
import br.edu.ifpb.entidade.Voto;


@SessionScoped
@ManagedBean	
public class VotacaoBean {
	
	Eleitor eleitor;
	Candidato candidato;
	Voto voto;  
	
	public VotacaoBean() {
		
		this.eleitor = new Eleitor();
		this.candidato = new Candidato();
		this.voto = new Voto();
	}

	public void verificarTitulo() throws IOException{
		EleitorDAO eleitorDAO = new EleitorDAO();
		Eleitor eleitor_aux = eleitorDAO.getByTitulo(eleitor.getTitulo_votacao());
		
		if(eleitor_aux!=null){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("eleitor", eleitor_aux);
			FacesContext.getCurrentInstance().getExternalContext().redirect("votar.xhtml");
		}else{
			System.out.println("É nulo");
		}
		
		VotoDAO votoDAO = new VotoDAO();
		List<Voto> voto_aux = votoDAO.getByVoto(eleitor_aux.getId());
		System.out.println("teste");
		if(voto_aux == null){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("eleitor", eleitor_aux);
			FacesContext.getCurrentInstance().getExternalContext().redirect("votar.xhtml");
		}else if(voto_aux.size() < 4){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("eleitor", eleitor_aux);
			FacesContext.getCurrentInstance().getExternalContext().redirect("votar.xhtml");
		}else{
			System.out.println("nulo");
		}
	}
	
	public void votar(){
		Date data = new Date();
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		
		eleitor = (Eleitor)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("eleitor");

		Candidato candidato = candidatoDAO.getByNumero(voto.getVoto_candidato());
		
		voto.setData(data);
		voto.setEleitor(eleitor);
		voto.setCandidato(candidato);
		
		System.out.println(eleitor.getId());
		System.out.println(candidato.getId());
		
		VotoDAO votoDAO = new VotoDAO();
		votoDAO.insert(voto);	
		
	}
	
	public void votar_branco(){
		Date data = new Date();
		
		eleitor = (Eleitor)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("eleitor");
				
		voto.setData(data);
		voto.setEleitor(eleitor);
		voto.setCandidato(null);
		voto.setVoto_candidato(0);
		
		System.out.println(eleitor.getId());
		System.out.println(candidato.getId());
		
		VotoDAO votoDAO = new VotoDAO();
		votoDAO.insert(voto);	
		
	}
	
	public void encerrar_eleicao(){
		
	
		
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
	

	