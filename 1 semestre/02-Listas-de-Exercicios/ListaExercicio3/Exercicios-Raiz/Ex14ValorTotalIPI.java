
import java.util.Scanner;

public class Ex14ValorTotalIPI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 14: Cálculo de IPI ---");
        System.out.print("Informe o valor unitário do produto: R$ ");
        double valorUnitario = sc.nextDouble();

        System.out.print("Informe a quantidade de unidades: ");
        int quantidade = sc.nextInt();

        System.out.print("Informe o percentual de IPI (ex: 15): ");
        double percentualIPI = sc.nextDouble();

        double valorTotalSemImposto = valorUnitario * quantidade;
        double valorIPI = valorTotalSemImposto * (percentualIPI / 100);
        double valorTotalComImposto = valorTotalSemImposto + valorIPI;

        System.out.println("\nResumo da Compra:");
        System.out.println("Valor Total (sem imposto): R$ " + valorTotalSemImposto);
        System.out.println("Valor do IPI (" + percentualIPI + "%): R$ " + valorIPI);
        System.out.println("Valor Final (com imposto): R$ " + valorTotalComImposto);

        sc.close();
    }
}
