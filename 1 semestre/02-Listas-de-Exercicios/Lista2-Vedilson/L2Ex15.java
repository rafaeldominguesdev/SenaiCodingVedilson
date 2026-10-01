
import java.util.Scanner;

public class L2Ex15 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Digite o valor de A");
        a = rafex.nextInt();
        System.out.println("Digite o valor de B");
        b = rafex.nextInt();
        System.out.println("Digite o valor de C");
        c = rafex.nextInt();

        if (a == b && b == c) {
            System.out.println("O triângulo é equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("O triângulo é isósceles");
        } else {
            System.out.println("O triângulo é escaleno");
        }

        rafex.close();

    }
}