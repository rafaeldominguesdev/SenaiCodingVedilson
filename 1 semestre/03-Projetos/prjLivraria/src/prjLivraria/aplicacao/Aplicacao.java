package prjLivraria.aplicacao;

import Classes.Pratileira;

public class Aplicacao {
	public static void main(String[] args) {
		Pratileira pratileira = new Pratileira(2);
		
		pratileira.adicinarLivro("O Hobbit");
		pratileira.adicinarLivro("O Nevoeiro");
		
		pratileira.adicinarLivro("Nárnia");
		
		pratileira.exibirLivros();
		
		
	}
}
