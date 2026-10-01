package pkg;

import java.util.Scanner;

public class L5Ex1 {
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


		if (opcao == 1) {
			adicao = num1+num2;
			System.out.println("O resultado do cálculo é: " + adicao);
		} if (opcao ==2) {
			subtracao = num1-num2;
			System.out.println("O resultado do cálculo é: " + subtracao);

		} if (opcao ==3 ) {
			multi = num1*num2;
			System.out.println("O resultado do cálculo é: " + multi);

		} if (opcao == 4) {
			if (num2==0)
				System.out.print("Erro: Divisão por zero!");
			} else {
				divisao = num1/num2;
				System.out.println("O resultado do cálculo é: " + divisao);
			}
	ler.close();
	}
}