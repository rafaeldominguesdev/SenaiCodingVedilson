package pkg;

import java.util.Scanner;

public class L3Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double media, n1, n2;
		
		System.out.print("Digite a primeira nota");
		n1 = ler.nextInt();
		
		System.out.print("Digite a segunda nota ");
		n2 = ler.nextInt();
		
		media = (n1+n2)/2.0;
		
		if ( media>=6.0) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
	}

}
