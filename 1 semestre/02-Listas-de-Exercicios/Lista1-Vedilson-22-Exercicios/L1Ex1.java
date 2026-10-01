import java.util.Scanner;

public class L1Ex1 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        // Programa para quando numero for 0

        System.out.println("informe o primeiro numero ");
        System.out.println("informe o segundo numero ");
        System.out.println("informe o terceiro numero ");

        int num1 = rafex.nextInt();
        int num2 = rafex.nextInt();
        int num3 = rafex.nextInt();

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("um dos numeros informados foi 0");
        } else {
            System.out.println("Os numeros escritos foi " + num1 + " , " + num2 + " , " + num3);

        }

        rafex.close();
    }
}