package pkg;

import java.util.Scanner;

public class L4Ex4 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, nota;
		
		System.out.print("Fale a primeira nota");
			n1 = ler.nextDouble();
		System.out.print("Fale a segunda nota");
			n2 = ler.nextDouble();
		System.out.print("Fale a terceira nota");
			n3 = ler.nextDouble();
			
	nota = (n1+n2+n3)/3;
	
	
	if ( nota>=7) {
		System.out.print("Aprovado");
	} else if (nota>=4){
		System.out.print("Recuperação");	
	} else {
		System.out.print("Reprovado");
	}
	
		ler.close();
	}
}
