import java.util.Scanner;

public class Ex07DescontoTernario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 7: Desconto com Operador Ternário ---");
        System.out.print("Informe o valor da compra: ");
        double compra = sc.nextDouble();

        double desconto = (compra > 100) ? (compra * 0.10) : 0;
        double valorFinal = compra - desconto;

        String mensagem = (compra > 100) ? "Você recebeu 10% de desconto!" : "Sem desconto para esta compra.";
        
        System.out.println(mensagem);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        sc.close();
    }
}
