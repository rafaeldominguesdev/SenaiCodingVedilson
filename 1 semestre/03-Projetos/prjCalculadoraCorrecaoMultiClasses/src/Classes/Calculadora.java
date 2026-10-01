package Classes;

public class Calculadora {
	private int primeiroOperador;
	private int operacao;
	private int segundoOperador;
	private int operecao;
	
	//construtores
	public Calculadora () {
		
	}
	
	public Calculadora(int primeiroOperador, int segundoOperador, int operacao) {
		this.primeiroOperador = primeiroOperador;
		this.segundoOperador = segundoOperador;
		this.operacao = operacao;
		
		
	}

	// getters e setters
	public int getPrimeiroOperador() {
		return primeiroOperador;
	}
	
	public void setPrimeiroOperador(int primeiroOperador) {
		this.primeiroOperador = primeiroOperador;
	}
	public int getSegundoOperador() {
		return 0;
	}
	
	public void setSegundoOperador(int segundoOperador) {
		this.segundoOperador = segundoOperador;
	}
	
	public void setOperacao(int operacao) {
		this.operecao = operacao;
		
	}
	public int getOperacao() {
		return operacao;
		
	}
	
}
