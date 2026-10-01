// 2. Faça um algoritmo que leia um conjunto de dados numéricos (num) e imprima
// na tela o maior (max) dentre eles.
// Admita que o valor -1 é utilizado como sentinela para finalizar a leitura de
// números. Ex.: num = 1, 2, 3 / max = 3 ]

import java.util.Scanner;

public class L1Ex5 {
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
