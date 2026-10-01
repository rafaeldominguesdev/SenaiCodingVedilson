package prjCalculadoraCorrecao.sistema;

import java.util.Scanner;

import prjCalculadoraCorrecao.classe.Calculadora;

public class Sistema {
	public static void main(String[] args) {
		//Scanner para leitura
		Scanner ler = new Scanner(System.in);
		
		//Instânciação 
		Calculadora calculadora = new Calculadora();
		
		
		System.out.println("----- CALCULADORA -----");
		System.out.println("- 1- Somar");
		System.out.println("- 2- Subtrair");
		System.out.println("- 3- Dividir");
		System.out.println("- 4- Multiplicar");
		System.out.println("-----------------------");
		System.out.print("Escolha a operação que deseja usar: ");
		calculadora.setOperacao(ler.nextInt());
		
		System.out.println("Informe o primeiro número");
		calculadora.setPrimeiroOperador(ler.nextInt());
		System.out.println("Informe o segundo número");
		calculadora.setSegundoOperador(ler.nextInt());
		
		
		switch(calculadora.getOperacao()) {
		case 1:
			System.out.println("A soma é: " + calculadora.somar());
			break;
		case 2:
			System.out.println("A subtração é: " + calculadora.subtrair());
			break;
		case 3:
			System.out.println("A divisão é: " + calculadora.dividir());
			break;
		case 4:
			System.out.println("A multiplicação é: " + calculadora.multiplicar());
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		ler.close();
	}
}
