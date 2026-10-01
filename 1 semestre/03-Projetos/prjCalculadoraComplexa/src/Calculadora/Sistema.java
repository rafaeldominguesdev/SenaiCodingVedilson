package Calculadora;

import java.util.Scanner;

import Dados.Dados;

import Dados.Metodos;

public class Sistema {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Dados opcao = new Dados();
		
		
		Metodos metodos = new Metodos();
		
		System.out.println("**********************Calculadora**********************");
		System.out.println("Opcao 1 - Somar                                       *");
		System.out.println("Opcao 2 - Subtrair                                    *");
		System.out.println("Opcao 3 - Dividir                                     *");
		System.out.println("Opcao 4 - Multiplicar                                 *");
		System.out.println("Qual vc quer fazer ?");
		opcao.setOpcao(ler.nextDouble());
		
		System.out.println("Fale o primeiro número !");
		opcao.setPrimeiroNumero(ler.nextDouble());
		
		System.out.println("Fale o segundo número !");
		opcao.setSegundoNumero(ler.nextDouble());
		
		if (opcao.getOpcao() == 1) {
			new Metodos().soma(opcao.getPrimeiroNumero(), opcao.getSegundoNumero());
		} else if (opcao.getOpcao() == 2) {
			new Metodos().subtrair(opcao.getPrimeiroNumero(), opcao.getSegundoNumero());
		} else if (opcao.getOpcao() == 3) {
			new Metodos().dividir(opcao.getPrimeiroNumero(), opcao.getSegundoNumero());
		} else if (opcao.getOpcao() == 4) {
			new Metodos().multiplicar(opcao.getPrimeiroNumero(), opcao.getSegundoNumero());
		} else {
			
			System.out.println("Opção inválida!");
		}
		
		ler.close();
	}
}
