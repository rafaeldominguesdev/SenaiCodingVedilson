package pkg;

import java.util.Scanner;

public class L1Ex3 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double n1, sucessor, antecessor;
			
			System.out.print("Digite um numero: ");
			n1 = ler.nextDouble();
	
			sucessor = (n1 + 1);
			antecessor = (n1 - 1);

			System.out.print("O numero sucessor é " + sucessor);
			System.out.print("O numero antecessor é " + antecessor);
			
			ler.close();
		}


	}

