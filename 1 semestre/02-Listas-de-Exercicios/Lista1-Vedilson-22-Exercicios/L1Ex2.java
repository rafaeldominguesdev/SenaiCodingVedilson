//Conversão de dollar para real com menu

import java.util.Scanner;

public class L1Ex2 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double cotacao;
        double valor;
        int opçao;

        System.out.println("1- converter dollar para real");
        System.out.println("2- sair");
        opçao = rafex.nextInt();

        switch (opçao) {
            case 1:
                System.out.println("informe a cotacao");
                cotacao = rafex.nextDouble();
                System.out.println("informe o valor");
                valor = rafex.nextDouble();
                System.out.println("o valor em real é " + (valor * cotacao));
                break;
            case 2:
                System.out.println("sair");
                break;
            default:
                System.out.println("opcao invalida");
        }

        rafex.close();
    }
}
