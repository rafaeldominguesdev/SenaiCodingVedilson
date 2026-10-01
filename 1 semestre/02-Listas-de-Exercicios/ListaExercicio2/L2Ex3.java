package pkg;

import java.util.Scanner;

public class L2Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double raio, perimetro;
		
		System.out.print("Fale o raio: \n");
		raio = ler.nextDouble();

		perimetro = (2*3.14*raio);
		
		System.out.print("O perimetro é  " + perimetro);
		
		ler.close();
	}


}
