import java.util.Scanner;

public class Ex12Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 12: Múltiplos de 3 e 5 ---");
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println(numero + " é múltiplo de 3 e 5!");
        } else if (numero % 3 == 0) {
            System.out.println(numero + " é apenas múltiplo de 3.");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " é apenas múltiplo de 5.");
        } else {
            System.out.println(numero + " não é múltiplo nem de 3, nem de 5.");
        }

        sc.close();
    }
}
