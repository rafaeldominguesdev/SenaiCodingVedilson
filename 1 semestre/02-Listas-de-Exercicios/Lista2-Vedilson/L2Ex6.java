
import java.util.Scanner;

public class L2Ex6 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double valorqualquer;

        System.out.println("informe um valor qualquer");
        valorqualquer = rafex.nextDouble();

        System.out.println("o valor com reajuste de 5% é " + (valorqualquer * 1.05));

        rafex.close();
    }
}
