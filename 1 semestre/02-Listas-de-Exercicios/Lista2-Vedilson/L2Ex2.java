
import java.util.Scanner;

public class L2Ex2 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int num;

        System.out.println("informe um numero");
        num = rafex.nextInt();

        if (num % 2 == 0) {
            System.out.println("o numero é par");
        } else {
            System.out.println("o numero é impar");
        }

        if (num > 0) {
            System.out.println("o numero é positivo");
        } else {
            System.out.println("o numero é negativo");
        }

        rafex.close();
    }
}