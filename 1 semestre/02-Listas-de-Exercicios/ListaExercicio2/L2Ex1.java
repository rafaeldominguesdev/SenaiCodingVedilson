package pkg;

import java.util.Scanner;

public class L2Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, soma, subtracao, divisao, multiplicacao;
		
		System.out.print("Fale o primeiro numero: \n");
		n1 = ler.nextDouble();
		System.out.print("Agora segundo numero: ");
		n2 = ler.nextDouble();
		
		soma = (n1+n2);
		subtracao = (n1-n2);
		divisao = (n1/n2);
		multiplicacao = (n1*n2);

		System.out.print("O Resultado da soma é  " + soma + "\n");
		System.out.print("O Resultado da subtração é  " + subtracao + "\n");
		System.out.print("O Resultado da divisão  " + divisao+ "\n");
		System.out.print("O Resultado da multiplicação é  " + multiplicacao + "\n");
		
		ler.close();
	}


}
