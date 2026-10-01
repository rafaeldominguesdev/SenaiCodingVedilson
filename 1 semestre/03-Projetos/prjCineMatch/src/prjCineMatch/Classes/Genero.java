package prjCineMatch.Classes;

public class Genero {
	//Atriutos
	
	private String genero;
	private String descricao;
	


	//Construtores

	public void generoNovo(String genero, String descricao) {
		this.genero = genero;
		this.descricao = descricao;
	}

	//Getters & Setters
	public String getGenero() {
		return genero;
	}

	public void setGeneroFilme(String descricao) {
		this.genero = descricao;
	}

	public String getDescricaoFilme() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	//toString
	@Override
	public String toString() {
		return  "autor " + this.descricao
				+"anoPublicacao " + this.descricao
				+"}";
		
	
	}}
