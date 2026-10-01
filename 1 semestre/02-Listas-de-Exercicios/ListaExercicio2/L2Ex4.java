package pkg;

import java.util.Scanner;

public class L2Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double raio, area;
		
		System.out.print("Fale o raio: \n");
		raio = ler.nextDouble();

		area = 3.14 * Math.pow(raio, 2);
		
		System.out.print("A area é   " + area);
		
		ler.close();
	}


}
