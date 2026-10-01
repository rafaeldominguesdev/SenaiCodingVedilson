package lista6;

import java.util.Scanner;

public class L6Ex1 {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		Double idade;
		
		System.out.println("digite sua idade: ");
		idade = ler.nextDouble();
		
		if (idade<=12) {
			System.out.println("Você está no infaltil");
			
		} if (idade >= 13 && idade <=17) {
			System.out.println("Você está no juvenil");
		} if (idade >= 18 && idade <= 40) {
			System.out.print("Você está no adulto");
		} if (idade >= 40) {
			System.out.println("Você está no master");
		}
		ler.close();
	}
}
