package Calculadora;

import java.util.Scanner;
import Classes.Classes;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        	Classes vedilson = new Classes();
        		
        		
        System.out.println("Bem-vindo à calculadora ambulante");
        System.out.println("Opção 1 - Soma");
        System.out.println("Opção 2 - Subtrair");
        System.out.println("Opção 3 - Dividir");
        System.out.println("Opção 4 - Multiplicar");

        int opcao = ler.nextInt();

        System.out.println("Digite o primeiro número:");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = ler.nextInt();

	        if (opcao == 1) {
	            vedilson.somar(num1, num2);
	            System.out.println("O resultado é: " + vedilson.getSoma());
	
	        } else if (opcao == 2) {
	            vedilson.subtrair(num1, num2);
	            System.out.println("O resultado é: " + vedilson.getSubtracao());
	
	        } else if (opcao == 3) {
	            vedilson.dividir(num1, num2);
	            System.out.println("O resultado é: " + vedilson.getDivisao());
	
	        } else if (opcao == 4) {
	            vedilson.multiplicacao(num1, num2);
	            System.out.println("O resultado é: " + vedilson.getMultiplicacao());
	
	        } else {
	            System.out.println("Opção inválida!");
	        }
	        
	        ler.close();
    }
    
    
}