package prjSistemaFaltas.classes;

public class Usuario {
	
	//atributos 
	
	protected String nome;
	protected String codigoRegistro;
	protected static int contador;
	protected int idade;

	static {
		contador = 1050;
	}
	
	//Construtores
	
	public Usuario() {
		
	}
	public Usuario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	
	//Getters & Setters
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
