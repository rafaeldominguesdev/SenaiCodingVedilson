package prjSistemaFaltas.classes;

public class Aluno extends Usuario {
    // Atributos
    private int aulasPresente;
    private int nota;
    
    //bloco de Inicialização
    
    {
    codigoRegistro = "RA" + contador;
    	contador++;
    }
    
    public String toString() {
        return "Aluno{nomeAluno=" + nome
                + ", ra=" + codigoRegistro
                + ", aulasPresente=" + aulasPresente
                + ", nota=" + nota
                + "}";
        
    } 

    // Construtores
    public Aluno() {}

    public Aluno(String nome, int nota, int aulasPresente) {
    	super(nome, 0);
    	this.nota = nota;
    	this.aulasPresente = aulasPresente;
    }

    public Aluno(String nome, int nota, int aulasPresente, int idade) {
    	
    		super(nome,idade);
    		this.nota = nota;
    		this.aulasPresente = aulasPresente;
    		
    		
    		}
    
    //Getters & Setterss

    public int getAulasPresente() {
        return aulasPresente;
    }

    public void setAulasPresente(int aulasPresente) {
        this.aulasPresente = aulasPresente;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}