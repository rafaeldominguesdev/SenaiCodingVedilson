import java.util.Scanner;

public class Ex03CreditoEspecial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 3: Crédito Especial ---");
        System.out.print("Informe seu saldo médio no último ano: ");
        double saldoMedio = sc.nextDouble();

        double credito = 0;

        if (saldoMedio <= 500) {
            credito = 0;
            System.out.println("Você não possui crédito especial.");
        } else if (saldoMedio > 500 && saldoMedio <= 1000) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio > 1000 && saldoMedio <= 3000) {
            credito = saldoMedio * 0.40;
        } else {
            credito = saldoMedio * 0.50;
        }

        if (credito > 0) {
            System.out.printf("Seu saldo médio foi de: R$ %.2f\n", saldoMedio);
            System.out.printf("Valor do crédito especial concedido: R$ %.2f\n", credito);
        }

        sc.close();
    }
}
