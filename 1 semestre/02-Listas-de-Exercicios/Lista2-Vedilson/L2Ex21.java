import java.util.Scanner;

public class L2Ex21 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double bruto;

        System.out.print("Digite seu salario bruto");
        bruto = rafex.nextDouble();

        if (bruto <= 1621.00) {
            bruto = bruto - (bruto * 0.075);
            System.out.println("Seu salário líquido é: " + bruto);
        } else if (bruto <= 2902.84) {
            bruto = bruto - (bruto * 0.09);
            System.out.println("Seu salário líquido é: " + bruto);
        } else if (bruto <= 4354.27) {
            bruto = bruto - (bruto * 0.12);
            System.out.println("Seu salário líquido é: " + bruto);
        } else {
            bruto = bruto - (bruto * 0.14);
            System.out.println("Seu salário líquido é: " + bruto);
        }

        rafex.close();

    }
}