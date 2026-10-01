
import java.util.Scanner;

public class L2Ex8 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int a, b, c;

        System.out.println("informe o valor de a");
        a = rafex.nextInt();

        System.out.println("informe o valor de b");
        b = rafex.nextInt();

        System.out.println("informe o valor de c");
        c = rafex.nextInt();

        if (a > b && a > c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (b > a && b > c) {
            System.out.println(b + ", " + a + ", " + c);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }

        rafex.close();
    }
}
