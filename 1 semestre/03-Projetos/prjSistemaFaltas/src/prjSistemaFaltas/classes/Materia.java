package prjSistemaFaltas.classes;

import prjSistemaFaltas.enums.NomeMateria;

public class Materia {

    // Atributos
    private NomeMateria nomeMateria;
    private Professor professor;
    private Aluno aluno;
    private int totalAulas = 200;
    private static final double FALTAR_MAXIMAS;
    
    static{
    	FALTAR_MAXIMAS = 0.25;
    }
    
    public String toString() {
        return "Matéria{nomeMateria=" + nomeMateria
        		+ ",professor=" + professor 
        		+ ", alunos=" + aluno
        		+ ", totalAulas=" + totalAulas + "}";
    }

    // Construtores
    
    public Materia() {

    }

    public Materia(NomeMateria nomeMateria, Professor professor, Aluno aluno, int totalAulas) {
        this.nomeMateria = nomeMateria;
        this.professor = professor;
        this.aluno = aluno;
        this.totalAulas = totalAulas;
    }

    // Getters & Setters
    
    public NomeMateria getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(NomeMateria nomeMateria) {
        this.nomeMateria = nomeMateria;
    }
    
    public void setTotalAulas(int totalAulas) {
    	this.totalAulas = totalAulas;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

	public static double getFaltarMaximas() {
		return FALTAR_MAXIMAS;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	//Metodos
	public void apresentar() {
		System.out.println("A sua matéria é : " + nomeMateria);
		System.out.println("Aulas totais : " + totalAulas);
		System.out.println("Professor : " + professor.getNomeProfessor());
		System.out.println("Aluno : " +  aluno.getAulasPresente());
		System.out.println("Total de faltas " + (totalAulas - aluno.getAulasPresente()));
		
		
	}

} 