package pkg;

import java.util.Scanner;

public class L1Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, calculo;
		
		System.out.print("Fale um número bom: ");
		n1 = ler.nextDouble();

		calculo = (n1 /4);

		System.out.print("O seu número divido por 4 é" + calculo);;
		
		ler.close();
	
				
	}
}
