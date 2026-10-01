import java.util.Scanner;

public class Ex01Divisibilidade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 1: Divisibilidade ---");
        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        boolean divisivel = false;

        if (numero % 10 == 0) {
            System.out.println(numero + " é divisível por 10");
            divisivel = true;
        }
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5");
            divisivel = true;
        }
        if (numero % 2 == 0) {
            System.out.println(numero + " é divisível por 2");
            divisivel = true;
        }

        if (!divisivel) {
            System.out.println(numero + " não é divisível por 10, 5 ou 2");
        }

        sc.close();
    }
}
