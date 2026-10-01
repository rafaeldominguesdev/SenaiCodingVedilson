package pkg;

import java.util.Scanner;

public class L1Ex5 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double n1, calculo;
		
		System.out.print("Fale um número para ser multiplicado: ");
		n1 = ler.nextDouble();

		calculo = (n1 *3);

		System.out.print("O seu calculo é " + calculo);;
		
		ler.close();
	
				
	}
}
