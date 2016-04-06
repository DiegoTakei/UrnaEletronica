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
		
		apuracao.setQuantidadeVotos(votoDAO.getAll().size());
		
		List<Candidato> candidatos = candidatoDAO.getAllCandidatos();
		System.out.println("deu certo");
		
		System.out.println(candidatos.size());
		
		for (Candidato candidato_aux : candidatos) {
			
			switch (candidato_aux.getCargo()) {
			case "Prefeito":
				candidato_aux.setNum_votos(votoDAO.getVotosCandidato(candidato_aux.getNumero(),candidato_aux.getCargo()));
				
				if(apuracao.getPrefeitoMaisVotado()== null)
					apuracao.setPrefeitoMaisVotado(candidato_aux);
				
				else if(apuracao.getPrefeitoMaisVotado().getNum_votos() < candidato_aux.getNum_votos()){
					apuracao.setPrefeitoEleito(candidato_aux);
						
				}else if (apuracao.getPrefeitoMenosVotado()== null) 
					apuracao.setPrefeitoMenosVotado(candidato_aux);
				
				else if	(apuracao.getPrefeitoMenosVotado().getNum_votos() > candidato_aux.getNum_votos())
					apuracao.setPrefeitoMenosVotado(candidato_aux);
				
				break;
			
			case "Governador":
				
				candidato_aux.setNum_votos(votoDAO.getVotosCandidato(candidato_aux.getNumero(),candidato_aux.getCargo()));
				
				if(apuracao.getGovernadorMaisVotado()== null)
					apuracao.setGovernadorMaisVotado(candidato_aux);
				
				else if(apuracao.getGovernadorMaisVotado().getNum_votos() < candidato_aux.getNum_votos()){
					apuracao.setGovernadorEleito(candidato_aux);
						
				}else if (apuracao.getGovernadorMenosVotado()== null) 
					apuracao.setGovernadorMenosVotado(candidato_aux);
				else if	(apuracao.getGovernadorMenosVotado().getNum_votos() > candidato_aux.getNum_votos())
					apuracao.setGovernadorMenosVotado(candidato_aux);
				break;
				
			case "Presidente":
				
				candidato_aux.setNum_votos(votoDAO.getVotosCandidato(candidato_aux.getNumero(),candidato_aux.getCargo()));
				
				if(apuracao.getPresidenteMaisVotado()== null)
					apuracao.setPresidenteMaisVotado(candidato_aux);
				
				else if(apuracao.getPresidenteMaisVotado().getNum_votos() < candidato_aux.getNum_votos()){
					apuracao.setPrefeitoEleito(candidato_aux);
						
				}else if (apuracao.getPresidenteMenosVotado()== null) 
						apuracao.setPresidenteMenosVotado(candidato_aux);
					else if	(apuracao.getPresidenteMenosVotado().getNum_votos() > candidato_aux.getNum_votos())
						apuracao.setPresidenteMenosVotado(candidato_aux);
				
				break;

			default:
				break;
			}
			
		}
	
		apuracao.setPrefeitoEleito(apuracao.getPrefeitoMaisVotado());
		apuracao.setGovernadorEleito(apuracao.getGovernadorMaisVotado());
		apuracao.setPrefeitoEleito(apuracao.getPresidenteMaisVotado());
		apuracao.setQuantidadeBrancos(votoDAO.getVotosEmBranco());
		
		FacesContext.getCurrentInstance().getExternalContext().redirect("resultado.xhtml");
	}

	public Apuracao getApuracao() {
		return apuracao;
	}

	public void setApuracao(Apuracao apuracao) {
		this.apuracao = apuracao;
	}
	
	
}

