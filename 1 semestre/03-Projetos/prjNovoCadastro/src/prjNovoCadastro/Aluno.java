package prjNovoCadastro;

public class Aluno {
	// Atributos do Aluno
	String nome;
	int idade;
	String curso;
	
	void seApresentar() {
		System.out.print("Olá, me chamo " + nome + " tenho" + idade + " e estou cursando " + curso);
		
		}
	
	void envelhecer(int anos) {
		idade = idade + anos;
	}

}
