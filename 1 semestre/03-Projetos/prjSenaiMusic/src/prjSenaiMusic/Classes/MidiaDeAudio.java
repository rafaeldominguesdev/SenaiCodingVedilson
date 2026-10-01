package prjSenaiMusic.Classes;

public class MidiaDeAudio {
	
	//Atributos
	private String tituloDaMidia;
	private int duracaoEmSegundos;
	private String anoDeLancamento;
	
	
	//Getters & Setters 
	
	public int getDuracaoEmSegundos() {
		return duracaoEmSegundos;
	}
	public void setDuracaoEmSegundos(int duracaoEmSegundos) {
		this.duracaoEmSegundos = duracaoEmSegundos;
	}
	public String getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(String anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	public String getTituloDaMidia() {
		return tituloDaMidia;
	}
	public void setTituloDaMidia(String tituloDaMidia) {
		this.tituloDaMidia = tituloDaMidia;
	}
}
