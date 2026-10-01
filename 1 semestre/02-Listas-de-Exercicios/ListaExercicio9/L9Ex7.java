import java.util.Scanner;

public class L9Ex7 {
    public static void main(String[] args) {
        Scanner rafael = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite um número: ");
            int numero = rafael.nextInt();

            if (numero == 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("Soma = " + soma);

        rafael.close();
    }
}
