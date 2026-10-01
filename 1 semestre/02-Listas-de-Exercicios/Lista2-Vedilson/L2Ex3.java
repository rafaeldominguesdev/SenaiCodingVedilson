
import java.util.Scanner;

public class L2Ex3 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int a, b;

        System.out.println("informe o valor de A");
        a = rafex.nextInt();

        System.out.println("informe o valor de B");
        b = rafex.nextInt();

        if (a == b) {
            System.out.println("a soma entre A e B é " + (a + b));
        } else {
            if (a > b) {
                System.out.println("a diferença entre A e B é " + (a - b));
            } else {
                System.out.println("a diferença entre A e B é " + (b - a));
            }
        }

        rafex.close();
    }
}