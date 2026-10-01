
import java.util.Scanner;

public class L2Ex4 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int num;

        System.out.println("informe um numero");
        num = rafex.nextInt();

        System.out.println("o antecessor de " + num + " é " + (num - 1));
        System.out.println("o sucessor de " + num + " é " + (num + 1));

        rafex.close();
    }
}