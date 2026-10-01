package pkg;

import java.util.Scanner;

public class L2Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, media;
		
		System.out.print("Fale o primeiro numero: \n");
		n1 = ler.nextDouble();
		System.out.print("Agora segundo numero: ");
		n2 = ler.nextDouble();
		System.out.print("Agora terceiro numero: ");
		n3 = ler.nextDouble();
		
		media = Math.pow(n1 * n2 * n3, 1.0/3.0);

		System.out.printf("O Resultado da soma é %.2f ", + media);
		
		ler.close();
	}


}
