package pkg;

import java.util.Scanner;

public class L3Ex3 {
	public static void main(String[] args) {
		Scanner  ler = new Scanner(System.in);
		
		double  numero, conta;
		
		System.out.print("Me fale um número");
		numero = ler.nextDouble();
		
		if ( numero>0 ) {
			System.out.print("Seu número é positivo");
		} else 
		
		if  (numero==0){
			System.out.print("Seu número é zero ");
		} else {
			System.out.print("Seu número é negativo");
		}
		
		ler.close();
	}
}
