package Sistema;

import java.util.Scanner;

import Classes.Calculadora;
import Classes.Calculo;

public class Aplicacao {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	Calculadora calculadora = new Calculadora();
	
	System.out.println("----------Super Calculadona -----------");
	System.out.println("1- Somar");
	System.out.println("2- Subtrair");
	System.out.println("3 - Multiplicar");
	System.out.println("4 - Dividir");
	calculadora.setOperacao(ler.nextInt());
	
	System.out.println("Qual o primeiro número ?");
	calculadora.setPrimeiroOperador(ler.nextInt());
	System.out.println("Qual o segundo número ?");
	calculadora.setSegundoOperador(ler.nextInt());
	
	System.out.println("O resultado da sua operação é : " + new Calculo().
			escolhaOperacao(
					calculadora.getOperacao(),
			calculadora.getPrimeiroOperador(),
			calculadora.getSegundoOperador()));
	

	
	}

	
	}


