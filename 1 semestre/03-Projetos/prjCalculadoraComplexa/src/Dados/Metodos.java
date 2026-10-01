package Dados;

public class Metodos {

	public void soma(double primeiroNumero, double segundoNumero) {
		double soma = primeiroNumero + segundoNumero;
		System.out.println("O resultado da soma é: " + soma);
	}

	public void subtrair(double primeiroNumero, double segundoNumero) {
		double subtrair = primeiroNumero - segundoNumero;
		System.out.println("O resultado da subtração é: " + subtrair);
	}

	public void dividir(double primeiroNumero, double segundoNumero) {
		if (segundoNumero == 0) {
			System.out.println("Erro: Não é possível dividir por zero!");
		} else {
			double dividir = primeiroNumero / segundoNumero;
			System.out.println("O resultado da divisão é: " + dividir);
		}
	}

	public void multiplicar(double primeiroNumero, double segundoNumero) {
		double multiplicar = primeiroNumero * segundoNumero;
		System.out.println("O resultado da multiplicação é: " + multiplicar);
	}
}
