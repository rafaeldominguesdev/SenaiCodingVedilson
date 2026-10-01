import java.util.Scanner;

public class L8Ex2 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int ida1, ida2, ida3, ida4, ida5;

        System.out.println("Digite a idade da primeira pessoa: ");
        ida1 = rafex.nextInt();

        System.out.println("Digite a idade da segunda pessoa: ");
        ida2 = rafex.nextInt();

        System.out.println("Digite a idade da terceira pessoa: ");
        ida3 = rafex.nextInt();

        System.out.println("Digite a idade da quarta pessoa: ");
        ida4 = rafex.nextInt();

        System.out.println("Digite a idade da quinta pessoa: ");
        ida5 = rafex.nextInt();

        int soma = ida1 + ida2 + ida3 + ida4 + ida5;
        int media = soma / 5;

        System.out.println("A média de idade é: " + media);


        rafex.close();

    }

}
