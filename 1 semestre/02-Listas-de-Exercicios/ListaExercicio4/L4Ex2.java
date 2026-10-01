package pkg;

import java.util.Scanner;

public class L4Ex2 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, soma;
		
		System.out.print("Digite o primeiro número");
			n1 = ler.nextDouble();
		System.out.print("Digite o segundo número");
			n2 = ler.nextDouble();
		System.out.print("Digite o terceiro número");
			n3 = ler.nextDouble();
		
		soma = n1+n2+n3;
		
		if (soma>0) {
			System.out.print("A soma é positiva");
		} else if (soma==0){
			System.out.print("A soma é zero");
		} else  {
			System.out.print("A soma é negativa");
		}

		
		ler.close();
		
		}
}
