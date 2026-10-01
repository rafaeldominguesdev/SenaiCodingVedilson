
import java.util.Scanner;

public class L2Ex1 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int a, b, c;

        System.out.println("informe o valor de A");
        a = rafex.nextInt();

        System.out.println("informe o valor de B");
        b = rafex.nextInt();

        System.out.println("informe o valor de C");
        c = rafex.nextInt();

        if (a + b < c) {
            System.out.println("a soma entre A e B é menor que C");
        }

        rafex.close();
    }
}
