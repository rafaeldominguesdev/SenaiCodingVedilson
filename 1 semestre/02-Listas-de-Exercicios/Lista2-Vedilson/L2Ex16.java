import java.util.Scanner;

public class L2Ex16 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Digite a temperatura em Fahrenheit");
        fahrenheit = rafex.nextDouble();

        celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("A temperatura em Celsius é: " + celsius);

        rafex.close();

    }
}
