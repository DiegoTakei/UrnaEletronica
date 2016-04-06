package br.edu.ifpb.entidade;


public class Apuracao {
	
	
	private int id;
	
	private int QuantidadeVotos;

	private int QuantidadeBrancos;
	
	private int QuantidadeNulos;
	
	private int QuantidadeAusentes;
	
	private Candidato PrefeitoMaisVotado;
	
	private Candidato GovernadorMaisVotado;
	
	private Candidato PresidenteMaisVotado;
	
	private Candidato PrefeitoMenosVotado;
	
	private Candidato GovernadorMenosVotado;
	
	private Candidato PresidenteMenosVotado;
	
	private Candidato prefeitoEleito;
	
	private Candidato GovernadorEleito;
	
	private Candidato PresidenteEleito;	
	
	private Candidato CandidatosSegundoTurno;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidadeVotos() {
		return QuantidadeVotos;
	}

	public void setQuantidadeVotos(int quantidadeVotos) {
		QuantidadeVotos = quantidadeVotos;
	}

	public int getQuantidadeBrancos() {
		return QuantidadeBrancos;
	}

	public void setQuantidadeBrancos(int quantidadeBrancos) {
		QuantidadeBrancos = quantidadeBrancos;
	}

	public int getQuantidadeNulos() {
		return QuantidadeNulos;
	}

	public void setQuantidadeNulos(int quantidadeNulos) {
		QuantidadeNulos = quantidadeNulos;
	}

	public int getQuantidadeAusentes() {
		return QuantidadeAusentes;
	}

	public void setQuantidadeAusentes(int quantidadeAusentes) {
		QuantidadeAusentes = quantidadeAusentes;
	}

	public Candidato getPrefeitoMaisVotado() {
		return PrefeitoMaisVotado;
	}

	public void setPrefeitoMaisVotado(Candidato prefeitoMaisVotado) {
		PrefeitoMaisVotado = prefeitoMaisVotado;
	}

	public Candidato getGovernadorMaisVotado() {
		return GovernadorMaisVotado;
	}

	public void setGovernadorMaisVotado(Candidato governadorMaisVotado) {
		GovernadorMaisVotado = governadorMaisVotado;
	}

	public Candidato getPresidenteMaisVotado() {
		return PresidenteMaisVotado;
	}

	public void setPresidenteMaisVotado(Candidato presidenteMaisVotado) {
		PresidenteMaisVotado = presidenteMaisVotado;
	}

	public Candidato getPrefeitoMenosVotado() {
		return PrefeitoMenosVotado;
	}

	public void setPrefeitoMenosVotado(Candidato prefeitoMenosVotado) {
		PrefeitoMenosVotado = prefeitoMenosVotado;
	}

	public Candidato getGovernadorMenosVotado() {
		return GovernadorMenosVotado;
	}

	public void setGovernadorMenosVotado(Candidato governadorMenosVotado) {
		GovernadorMenosVotado = governadorMenosVotado;
	}

	public Candidato getPresidenteMenosVotado() {
		return PresidenteMenosVotado;
	}

	public void setPresidenteMenosVotado(Candidato presidenteMenosVotado) {
		PresidenteMenosVotado = presidenteMenosVotado;
	}

	public Candidato getPrefeitoEleito() {
		return prefeitoEleito;
	}

	public void setPrefeitoEleito(Candidato prefeitoEleito) {
		this.prefeitoEleito = prefeitoEleito;
	}

	public Candidato getGovernadorEleito() {
		return GovernadorEleito;
	}

	public void setGovernadorEleito(Candidato governadorEleito) {
		GovernadorEleito = governadorEleito;
	}

	public Candidato getPresidenteEleito() {
		return PresidenteEleito;
	}

	public void setPresidenteEleito(Candidato presidenteEleito) {
		PresidenteEleito = presidenteEleito;
	}

	public Candidato getCandidatosSegundoTurno() {
		return CandidatosSegundoTurno;
	}

	public void setCandidatosSegundoTurno(Candidato candidatosSegundoTurno) {
		CandidatosSegundoTurno = candidatosSegundoTurno;
	}
	

}
