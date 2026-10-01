
import java.util.Scanner;

public class L2Ex11 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int nota1, nota2, nota3, nota4, media;

        System.out.println("informe a nota 1");
        nota1 = rafex.nextInt();

        System.out.println("informe a nota 2");
        nota2 = rafex.nextInt();

        System.out.println("informe a nota 3");
        nota3 = rafex.nextInt();

        System.out.println("informe a nota 4");
        nota4 = rafex.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        rafex.close();
    }
}