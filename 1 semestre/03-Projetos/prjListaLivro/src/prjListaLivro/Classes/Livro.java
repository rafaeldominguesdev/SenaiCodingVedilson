package prjListaLivro.Classes;

public class Livro {
	
	//atributos
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	//Metodos
	public Livro() {}
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	//Getters & Setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	//toString
	@Override
	public String toString() {
		return "Livro{titulo=" + this.titulo
				+"autor" + this.autor
				+"anoPublicacao" + this.anoPublicacao
				+"}";
		
		
				
	}
}
