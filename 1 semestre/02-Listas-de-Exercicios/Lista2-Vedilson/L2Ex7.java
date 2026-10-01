
import java.util.Scanner;

public class L2Ex7 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        boolean valor1, valor2;

        System.out.println("informe o valor 1");
        valor1 = rafex.nextBoolean();

        System.out.println("informe o valor 2");
        valor2 = rafex.nextBoolean();

        if (valor1 == valor2) {
            System.out.println("Os dois valores são iguais");
        } else {
            System.out.println("Os valores são diferentes");
        }

        rafex.close();
    }
}
