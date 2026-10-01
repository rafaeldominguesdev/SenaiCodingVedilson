import java.util.Scanner;

public class L9Ex5 {
    public static void main(String[] args) {
        Scanner rafael = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "o número: ");
            int numero = rafael.nextInt();

            if (i == 1 || numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior número: " + maior);

        rafael.close();
    }
}
