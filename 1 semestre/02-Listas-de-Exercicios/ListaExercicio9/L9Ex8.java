import java.util.Scanner;

public class L9Ex8 {
    public static void main(String[] args) {
        Scanner rafael = new Scanner(System.in);

        int aprovados = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Aluno " + i + ": ");
            double nota = rafael.nextDouble();

            if (nota >= 7.0) {
                aprovados++;
            }
        }
        System.out.println("Quantidade de aprovados: " + aprovados);

        rafael.close();
    }
}
