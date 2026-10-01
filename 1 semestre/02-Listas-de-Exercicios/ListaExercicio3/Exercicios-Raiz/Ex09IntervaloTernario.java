import java.util.Scanner;

public class Ex09IntervaloTernario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 9: Intervalo com Operador Ternário ---");
        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        String resultado = (numero >= 10 && numero <= 50) ? "Dentro do intervalo (10 a 50)" : "Fora do intervalo";

        System.out.println(resultado);

        sc.close();
    }
}
