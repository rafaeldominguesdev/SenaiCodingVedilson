import java.util.Scanner;

public class L2Ex12 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double produto = 2000;
        int formaPagamento;

        System.out.println("1 - Pix Dinheiro 15%  de desconto");
        System.out.println("2 - Cartão de crédito 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros");
        formaPagamento = rafex.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("O valor final do produto é: " + (produto - produto * 0.15));
                break;
            case 2:
                System.out.println("O valor final do produto é: " + (produto - produto * 0.10));
                break;
            case 3:
                System.out.println("O valor final do produto é: " + produto);
                break;
            case 4:
                System.out.println("O valor final do produto é: " + (produto + produto * 0.10));
                break;
            default:
                System.out.println("Forma de pagamento inválida");
        }

        rafex.close();

    }
}