package br.edu.ifpb.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.dao.VotoDAO;
import br.edu.ifpb.entidade.Apuracao;
import br.edu.ifpb.entidade.Candidato;

@ManagedBean
public class ApuracaoBean {
	
	Apuracao apuracao;
	
	public ApuracaoBean(){
		this.apuracao = new Apuracao();
	}
	
	public void encerrar_eleicao() throws IOException{
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		VotoDAO votoDAO = new VotoDAO();
		
		apuracao.setQnt_votos(votoDAO.getAll().size());
		
		List<Candidato> candidatos = candidatoDAO.getAllCandidatos();
		System.out.println("deu certo");
		
		System.out.println(candidatos.size());
		
		for (Candidato candidato_aux : candidatos) {
			
			switch (candidato_aux.getCargo()) {
			case "Prefeito":
				candidato_aux.setNum_votos(votoDAO.getVotosCandidato(candidato_aux.getNumero(),candidato_aux.getCargo()));
				
				if(apuracao.getPrefeito_mais_votado()== null)
					apuracao.setPrefeito_mais_votado(candidato_aux);
				
				else if(apuracao.getPrefeito_mais_votado().getNum_votos() < candidato_aux.getNum_votos()){
					apuracao.setPrefeito_eleito(candidato_aux);
						
				}else if (apuracao.getPrefeito_menos_votado()== null) 
					apuracao.setPrefeito_menos_votado(candidato_aux);
				
				else if	(apuracao.getPresidente_menos_votado().getNum_votos() > candidato_aux.getNum_votos())
					apuracao.setPrefeito_menos_votado(candidato_aux);
				
				break;
			
			case "Governador":
				
				candidato_aux.setNum_votos(votoDAO.getVotosCandidato(candidato_aux.getNumero(),candidato_aux.getCargo()));
				
				if(apuracao.getGovernador_mais_votado()== null)
					apuracao.setGovernador_mais_votado(candidato_aux);
				
				else if(apuracao.getGovernador_mais_votado().getNum_votos() < candidato_aux.getNum_votos()){
					apuracao.setGovernador_eleito(candidato_aux);
						
				}else if (apuracao.getGovernador_menos_votado()== null) 
					apuracao.setPresidente_menos_votado(candidato_aux);
				else if	(apuracao.getGovernador_menos_votado().getNum_votos() > candidato_aux.getNum_votos())
					apuracao.setGovernador_menos_votado(candidato_aux);
				break;
				
			case "Presidente":
				
				candidato_aux.setNum_votos(votoDAO.getVotosCandidato(candidato_aux.getNumero(),candidato_aux.getCargo()));
				
				if(apuracao.getPresidente_mais_votado()== null)
					apuracao.setPresidente_mais_votado(candidato_aux);
				
				else if(apuracao.getPresidente_mais_votado().getNum_votos() < candidato_aux.getNum_votos()){
					apuracao.setPresidente_eleito(candidato_aux);
						
				}else if (apuracao.getPresidente_menos_votado()== null) 
						apuracao.setPresidente_menos_votado(candidato_aux);
					else if	(apuracao.getPresidente_menos_votado().getNum_votos() > candidato_aux.getNum_votos())
						apuracao.setPresidente_menos_votado(candidato_aux);
				
				break;

			default:
				break;
			}
			
		}
	
		apuracao.setPrefeito_eleito(apuracao.getPrefeito_mais_votado());
		apuracao.setGovernador_eleito(apuracao.getGovernador_mais_votado());
		apuracao.setPresidente_eleito(apuracao.getPresidente_mais_votado());
		apuracao.setQnt_brancos(votoDAO.getVotosEmBranco());
		
		FacesContext.getCurrentInstance().getExternalContext().redirect("resultado.xhtml");
	}

	public Apuracao getApuracao() {
		return apuracao;
	}

	public void setApuracao(Apuracao apuracao) {
		this.apuracao = apuracao;
	}
	
	
}
