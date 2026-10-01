//3. Faça um programa que pergunte ao usuário o preço de vários produtos e mostre ao final o valor total destes.
//   O programa deve pedir ao usuário o valor de um produto e perguntar se o usuário deseja adicionar mais um.  Enquanto o usuário
//  responder que sim, o programa deve pedir o valor do novo produto e somar com os valores  informados anteriormente.
//  Quando o usuário responder que não, o programa deve sair do laço de repetição e  mostrar o total. 

import java.util.Scanner;

public class L1Ex3 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double preco;
        double total = 0;
        char resposta;

        while (true) {
            System.out.println("informe o preco do produto");

            preco = rafex.nextDouble();

            total += preco;

            System.out.println("deseja adicionar mais um produto? (s/n)");

            resposta = rafex.next().charAt(0);

            if (resposta == 'n') {
                break;
            }
        }

        System.out.println("o valor total é " + total);

        rafex.close();
    }
}
