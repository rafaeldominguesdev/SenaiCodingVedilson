//1. Faça um algoritmo que calcule a média de salários de uma empresa, pedindo
// ao usuário a  quantidade de funcionários
// e o salário de cada funcionário. O programa deve imprimir na tela um relatório
// contendo a média salarial, 
// o salário mais alto e o salário mais baixo. 

import java.util.Scanner;

public class L1Ex6 {
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