import java.util.Scanner;

public class L8Ex3 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número " + i + ": ");
            int num = rafex.nextInt();

            if (num > 10) {
                contador++;
            }
        }

        System.out.println("O total de números maiores que 10 são " + contador + ".");

        rafex.close();
    }
}
