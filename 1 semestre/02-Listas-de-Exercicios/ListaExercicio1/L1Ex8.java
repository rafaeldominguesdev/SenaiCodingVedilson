package pkg;

import java.util.Scanner;

public class L1Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, resultado;
		
		System.out.print("Qual o salário: ");
		salario = ler.nextDouble();

		salario= (salario/1640);

		System.out.printf("Essa pessoa ganha : %.2f", salario);
		
		
		ler.close();
	
				
	}
}
