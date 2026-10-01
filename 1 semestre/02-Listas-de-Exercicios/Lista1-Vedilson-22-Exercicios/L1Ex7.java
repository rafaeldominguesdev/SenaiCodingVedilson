// 2. Sem utilizar a operação de multiplicação, escreva um programa que multiplique
// dois números inteiros. Por exemplo: 3 * 2 = 2 + 2 + 2. 

import java.util.Scanner;

public class L1Ex7 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int num;
        int max = 0;

        while (true) {
            System.out.println("informe um numero");
            num = rafex.nextInt();
            if (num == -1) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("o maior numero é " + max);

        rafex.close();
    }
}
