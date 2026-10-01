import java.util.Scanner;

public class L2Ex17 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double francisco;
        double sara;
        double anos;

        System.out.println("Digite a altura de Francisco");
        francisco = rafex.nextDouble();
        System.out.println("Digite a altura de Sara");
        sara = rafex.nextDouble();
        System.out.println("Digite o número de anos");
        anos = rafex.nextDouble();

        francisco = francisco + (3 * anos);
        sara = sara + (2 * anos);

        System.out.println("A altura de Francisco é: " + francisco);
        System.out.println("A altura de Sara é: " + sara);

        rafex.close();

    }
}
