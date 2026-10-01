package prjCalculadoraCorrecao.classe;

public class Calculadora {

	//Atributos
	private int primeiroOperador; 
	private int segundoOperador;
	private int operacao;
	
	//Construtores
	public Calculadora() { //Primeiro Construtor
		
	}
	public Calculadora(int pPrimeiroOperador, int pSegundoOperador, int pOperacao) { //Segundo Construtor
		primeiroOperador = pPrimeiroOperador;
		segundoOperador = pSegundoOperador;
		operacao = pOperacao;
		
	}
	
	
	//Getters & Setters
	
	//Primeiro set e get
	public void setPrimeiroOperador(int pPrimeiroOperador) {
		primeiroOperador = pPrimeiroOperador;
	}
	public int getPrimeiroOperador() {
		return primeiroOperador;
	}
	
	//Segundo set e get
	public void setSegundoOperador(int pSegundoOperador) {
		segundoOperador = pSegundoOperador;
	}
	public int getSegundoOperador() {
		return segundoOperador;
	}
	
	//Terceiro set e get
	public void setOperacao(int pOperacao) {
		operacao = pOperacao;
	}
	public int getOperacao() {
		return operacao;
	}
	
	
	//Métodos 
	public int somar() { //Método para a soma
		return primeiroOperador + segundoOperador; //Retorno para possibilitar o "somar" para que a ação aconteça / Operação da soma
	} 
	public int subtrair() { //Método para a subtração
		return primeiroOperador - segundoOperador; //Retorno para possibilitar o "subtrair" para que a ação aconteça / Operação da subtração
	}
	public int dividir() { //Método para a divisão
		return primeiroOperador / segundoOperador; //Retorno para possibilitar o "dividir" para que a ação aconteça / Operação da divisão
	}
	public int multiplicar() { //Método para a multiplicação
		return primeiroOperador * segundoOperador; //Retorno para possibilitar o "multiplicar" para que a ação aconteça / Operação da multiplicação
	}
}
