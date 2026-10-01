package Classes;

public class Calculo {
	
	public int escolhaOperacao(int operacao, int primeiroOperador, int segundoOperador) {
		switch(operacao) {
		case 1 : {
			 return somar(primeiroOperador, segundoOperador);
		}
		case 2 : {
			return subtrair(primeiroOperador, segundoOperador);
		
		}
		case 3 : {
			return multiplicar(primeiroOperador, segundoOperador);
			
		}
		case 4 : {
			return dividir(primeiroOperador, segundoOperador);
			
			}
			
		}
		return 0;
	}
	
	public int somar(int primeiroNumero, int segundoNumero) {
		return primeiroNumero + segundoNumero;
		
	}
	
	public int subtrair(int primeiroNumero, int segundoNumero) {
		return primeiroNumero - segundoNumero;
		
	}
	public int multiplicar(int primeiroNumero, int segundoNumero) {
		return primeiroNumero * segundoNumero;
		
	}
	public int dividir(int primeiroNumero, int segundoNumero) {
		return primeiroNumero / segundoNumero;
		
	}
	

}
