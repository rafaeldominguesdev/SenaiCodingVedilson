import java.util.Scanner;

public class L2Ex18 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número");
        numero = rafex.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        rafex.close();

    }
}