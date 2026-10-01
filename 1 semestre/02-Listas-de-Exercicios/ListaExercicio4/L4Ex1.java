package pkg;

import java.util.Scanner;

public class L4Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, soma;
		
		System.out.print("Fale o primeiro número");
			n1 = ler.nextDouble();
		System.out.print("Fale o segundo número");
			n2 = ler.nextDouble();
		System.out.print("Fale o terceiro número");
			n3 = ler.nextDouble();
		

			soma = (n1+n2+n3)%5;
	
		if (soma==0) {
			System.out.print("A soma é divisivel por 5");
		} else {
			System.out.print("A soma é divisivel por 5");
	
		}
		
			
			
	}
}
