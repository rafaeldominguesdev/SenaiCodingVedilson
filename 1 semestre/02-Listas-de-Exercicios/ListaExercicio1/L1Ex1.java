package pkg;

import java.util.Scanner;

public class L1Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, resultado;
		
		System.out.print("Digite a primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.print("Digite a segundo numero: ");
		n2 = ler.nextDouble();
		
		resultado = (n1 * n2);

		System.out.print("O Resultado da Media é " + resultado);
		
		ler.close();
	}


}
