package exemplo;

import java.util.Scanner;

public class ExTernario1 {
	public static void main(String[] args) {
		Scanner top = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = top.nextInt();
		
		System.out.print(idade >= 18 ? "Maior de idade " : "Menor de idade ");
		
		
		
		top.close();
	}

}
