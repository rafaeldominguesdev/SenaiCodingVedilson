
package prjListaLivro.Classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	//Atributos
	private String nome;
	private String email;
	private List<Livro> livrosFavoritos;
	
	//Construtores
	public Usuario(String nome, String email, List<Livro> livrosFavoritos) {
		this.nome = nome;
		this.email = email;

		
		this.livrosFavoritos = new ArrayList<>();
	}

	//Getters & Setters 
	
	public Usuario(String nomeUsuario, String email2) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Livro> getLivrosFavoritos() {
		return livrosFavoritos;
	}

	public void favoritarLivro(Livro livro) {
		this.livrosFavoritos.add(livro);
	}
	
	public void desfavoritarLivro(String titulo) {
		for (int i = 0; i < this.livrosFavoritos.size(); i ++) {
			Livro livroExcluir = this.livrosFavoritos.get(i);
			
			if(livroExcluir.getTitulo().equals(titulo)){
				this.livrosFavoritos.remove(i);
			}			
		}
		
		
	}

	public void exibirFavoritos() {
		System.out.println("Favoritos de " + this.nome +": " 
							+ this.livrosFavoritos.size());
		if (this.livrosFavoritos.isEmpty()) {
			System.out.println("Lista vazia");
			return;	
		}
		
		for (int i = 0; i < this.livrosFavoritos.size(); i++) {
			  System.out.println(this.livrosFavoritos.get(i));
		}
		
	}
	
	
	
}
