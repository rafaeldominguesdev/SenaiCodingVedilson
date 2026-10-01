import java.util.Scanner;

public class L9Ex2 {
    public static void main(String[] args) {
        Scanner rafael = new Scanner(System.in);

        int positivos = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite um número: ");
            int numero = rafael.nextInt();

            if (numero > 0) {
                positivos++;
            }
            i++;
        }

        System.out.println("Quantidade de positivos: " + positivos);

        rafael.close();
    }
}
