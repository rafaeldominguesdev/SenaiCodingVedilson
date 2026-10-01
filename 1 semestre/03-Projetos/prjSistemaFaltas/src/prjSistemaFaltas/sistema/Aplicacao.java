package prjSistemaFaltas.sistema;

import prjSistemaFaltas.classes.Aluno;
import prjSistemaFaltas.classes.Materia;
import prjSistemaFaltas.classes.Professor;
import prjSistemaFaltas.enums.NomeMateria;

public class Aplicacao {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Bernardo", 100, 80);
		Professor professor = new Professor("Cleber");
		Materia materia = new Materia(NomeMateria.FISICA_QUANTICA, professor, aluno, 150);
		
		materia.apresentar();
		
		

	}
}
