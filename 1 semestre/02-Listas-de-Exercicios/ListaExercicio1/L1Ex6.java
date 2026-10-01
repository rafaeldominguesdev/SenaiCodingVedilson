package pkg;

import java.util.Scanner;

public class L1Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double lado, perimetro, area;
		
		System.out.print("Fale o lado do quadrado: ");
		lado = ler.nextDouble();

		perimetro = (lado*4);
		area = (lado*lado);

		System.out.print("A area do seu quadrado é   " + area  +"\n");
		System.out.print("O perimetro do seu quadrado é  " + perimetro  );
		
		
		ler.close();
	
				
	}
}
