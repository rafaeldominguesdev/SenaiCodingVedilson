package Classes;

public class Pratileira {
	
	//Atributos
	private String[] livros;
	private int quantidadeAtual;
	
	//Construtores
	public Pratileira() {}
	
	public Pratileira(int capacidade) {
		this.livros = new String[capacidade];
		this.quantidadeAtual = 0;
	}
	
	//Metodos
	public void adicinarLivro(String titulo) {
		if (this.quantidadeAtual < this.livros.length ) {
			this.livros[quantidadeAtual] = titulo;
			this.quantidadeAtual++;
		} else {
			System.out.println("Lotado");
		}
	}
	
	public void exibirLivros() {
		for ( int i = 0 ; i < this.livros.length; i ++) {
			if (this.livros[i]!= null) {
				System.out.println(this.livros[i]);
				
			} else {
				System.out.println("Vazio");
			}
		}
	}
		
}
	

