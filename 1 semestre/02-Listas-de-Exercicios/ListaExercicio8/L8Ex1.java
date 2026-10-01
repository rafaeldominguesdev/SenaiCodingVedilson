import java.util.Scanner;

public class L8Ex1 {
    public static void main(String[] args) {
        Scanner Rafex = new Scanner(System.in);

        int num, exp;

        System.out.println("Digite um número: ");
        num = Rafex.nextInt();

        System.out.println("Digite o expoente: ");
        exp = Rafex.nextInt();

        if (exp == 0) {
            System.out.println("O resultado é 1");
        } else if (exp > 0) {
            int resultado = 1;
            for (int i = 1; i <= exp; i++) {
                resultado *= num;
            }
            System.out.println("O resultado é " + resultado);
        }

        Rafex.close();
    }

}
