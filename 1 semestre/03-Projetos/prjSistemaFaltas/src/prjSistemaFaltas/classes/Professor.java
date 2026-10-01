package prjSistemaFaltas.classes;

public class Professor extends Usuario {
	
	{
		codigoRegistro = "SN " +contador;
		contador++;
	}

	// contratutores

	public Professor(String nome) {
		super(nome,idade);
	}
	
	
	@Override 
	public String toString() {
		return "Professor {\nomeProfessor=" + nome
				+ ", \nnif=" + codigoRegistro + "}";
	}

	public static int getContador() {
		return contador;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public String getNomeProfessor() {
		return nome;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nome = nomeProfessor;
	}
}
