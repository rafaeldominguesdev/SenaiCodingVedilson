import java.util.Scanner;

public class L9Ex1 {
    public static void main(String[] args) {
        Scanner rafael = new Scanner(System.in);

        int soma = 0;
        int i = 1;

        while (i <= 5) {
            System.out.print("Digite o número " + i + ": ");
            soma += rafael.nextInt();
            i++;
        }
        System.out.println("Soma = " + soma);
        rafael.close();
    }
}
