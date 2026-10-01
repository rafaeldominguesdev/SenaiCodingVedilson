//1. Faça um algoritmo que leia um conjunto de números (num) e imprima na tela a sua soma (soma) e a sua
//  média  (media). Admita que o valor -1 é utilizado como sentinela para finalizar a leitura de números.
//  Ex.: num = 1, 2, 3 /  soma = 6 / media = 2

import java.util.Scanner;

public class L1EX4 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int num;
        int soma = 0;
        int media = 0;

        while (true) {
            System.out.println("informe um numero");
            num = rafex.nextInt();
            if (num == -1) {
                break;
            }
            soma += num;
            media = soma / num;
        }

        System.out.println("a soma é " + soma);
        System.out.println("a media é " + media);

        rafex.close();
    }
}
