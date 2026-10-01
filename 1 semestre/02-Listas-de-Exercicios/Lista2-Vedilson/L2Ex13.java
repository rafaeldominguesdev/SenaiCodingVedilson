import java.util.Scanner;

public class L2Ex13 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int idade;
        System.out.println("Digite a idade da pessoa");
        idade = rafex.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        rafex.close();

    }
}
