import java.util.Scanner;

public class L2Ex14 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o valor de A");
        a = rafex.nextInt();
        System.out.println("Digite o valor de B");
        b = rafex.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);

        rafex.close();

    }
}
