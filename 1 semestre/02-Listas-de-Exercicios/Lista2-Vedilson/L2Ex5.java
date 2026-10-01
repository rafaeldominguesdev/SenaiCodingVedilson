
import java.util.Scanner;

public class L2Ex5 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double salarioMinimo = 1621.00;
        double SalarioPobre;

        System.out.println("informe o valor do salario do usuario");
        SalarioPobre = rafex.nextDouble();

        System.out.println("o usuario ganha " + (SalarioPobre / salarioMinimo) + " salarios minimos");

        rafex.close();
    }
}