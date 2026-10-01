
package pkg;

import java.util.Scanner;

public class L5Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opcao, adicao, subtracao, multi, divisao, num1 , num2;
		
		System.out.println("***********CALCULADORA***********");
		System.out.println(" ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println(" ");
		System.out.println("*********************************");
		System.out.println(" ");
		System.out.println("Digite a operação que você deseja: ");
		opcao = ler.nextInt();
		System.out.println("*********************************");
		System.out.println(" ");
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println(" ");
		System.out.println("*********************************");
		
		switch (opcao) {
		case 1:
			adicao = num1+num2;
			System.out.print("O resultado é: " + adicao);
			break;
		case 2:
			subtracao = num1-num2;
			System.out.print("O resultado é: " + subtracao);
			break;
		case 3:
			multi = num1*num2;
			System.out.print("O resultado é: " + multi);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Erro divisão por zero!");
			} else {
				divisao = num1/num2;
				System.out.print("O resultado é: " + divisao);
			}
			break;
		default:
			System.out.print("erro");
	}

	}
}	
