package pkg;

import java.util.Scanner;

public class L1Ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ladomenor, ladomaior, perimetro, area;
		
		System.out.print("Fale o lado menor do retangolo: ");
		ladomenor = ler.nextDouble();
		
		System.out.print("Fale o lado maior do retangolo: ");
		ladomaior = ler.nextDouble();
		

		perimetro = (ladomaior+ladomaior+ladomenor+ladomenor);
		area = (ladomenor*ladomaior);

		System.out.print("A area do seu retangolo é   " + area  +"\n");
		System.out.print("O perimetro do seu do retangolo é  " + perimetro  );
		
		
		ler.close();
	
				
	}
}
