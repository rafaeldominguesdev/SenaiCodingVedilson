package prjAula01;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		//Biblioteca de entrada de dados
		Scanner ler = new Scanner(System.in);
		
		// Declaração das variáveis
		// int soma, numero1, numero2;
		
		int numero1;
		int numero2;_
		int soma; 
		
		//Entrada de Dados
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o segunda número: ");
		numero2 = ler.nextInt();
		
		//Processame to (Atribuição)
		soma= numero1 + numero2;
		
		//Saída de dados
		System.out.print("O resultado da soma é " + soma);
		
		ler.close();
		
		
		
	}
}
