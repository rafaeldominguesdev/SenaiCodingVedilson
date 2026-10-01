package prjJogoNaruto.sistema;

import java.util.Scanner;

import prjJogoNaruto.classes.*;


public class Aplicacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Ninja primeiroNinja = new Ninja();
		primeiroNinja.nome = "Cleber Paixão";
		primeiroNinja.vida = 200;
		primeiroNinja.magia = 50;
		
		primeiroNinja.atacar("Meteoro da Paixão");
		
		Ninja segundoNinja = new Ninja("Roberval", 50,500);
		
		segundoNinja.atacar("Voadora de andador");
		
		Ninja terceiroNinja = new Ninja();
		
		System.out.println("Qual seu nome ninja");
		terceiroNinja.nome = ler.nextLine();
		System.out.println("Qual a quantidade de magia ninja");
		terceiroNinja.magia = ler.nextInt();
		System.out.println("Qual seu vida ninja");
		terceiroNinja.vida = ler.nextInt();
		
		 /*System.out.println("Nome : " + terceiroNinja.nome);
		System.out.println("Vida : " + terceiroNinja.vida);
		System.out.println("Magia : " + terceiroNinja.magia); */
		
		
		System.out.println("Qual ninja você quer atacar ?");
		System.out.println(" 1 - Cleber Paixão");
		System.out.println("2 -  Roberval");
		int opcao = ler.nextInt();
		
		if (opcao == 1) {
			terceiroNinja.atacar(terceiroNinja, primeiroNinja);
			
		} else if (opcao == 2) {
			terceiroNinja.atacar(terceiroNinja, segundoNinja);
			
		} else  {
			System.out.println("Opção Inválida");
		}
		
		Ninja quartoNinja = new Ninja();
		quartoNinja.nome = "Jamon";
		
		quartoNinja.setPoderOculto(5000);
		
		
		System.out.println("O ninja " + quartoNinja.nome + "tem " + quartoNinja.getPoderOculto() + "de pode oculto");
		
		ler.close();
			
		
		
		
	}

}
