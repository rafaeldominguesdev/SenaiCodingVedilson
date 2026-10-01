import java.util.Scanner;

public class L8Ex4 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número " + i + ": ");
            int num = rafex.nextInt();

            if (num >= 0 && num <= 100) {
                contador++;
            }
        }

        System.out.println("O total de números entre 0 e 100 são " + contador + ".");

        rafex.close();
    }
}
