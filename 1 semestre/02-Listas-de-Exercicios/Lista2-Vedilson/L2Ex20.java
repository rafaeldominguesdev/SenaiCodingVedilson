//20 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o  quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class L2Ex20 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite um número");
        a = rafex.nextInt();
        System.out.println("Digite outro número");
        b = rafex.nextInt();

        System.out.println("O quociente é: " + (a / b));
        System.out.println("O resto é: " + (a % b));
        rafex.close();

    }
}