package pkg;

import java.util.Scanner;

public class L3Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero, resto;
		
		System.out.print("Fale um número ");
		numero = ler.nextInt();
		
		resto = numero%2;
		
		if ( resto==0) {
			System.out.print("O seu número é par");
		} else {
			System.out.print("O seu numero é impar");
		}
		
		ler.close();
		
	}
}
