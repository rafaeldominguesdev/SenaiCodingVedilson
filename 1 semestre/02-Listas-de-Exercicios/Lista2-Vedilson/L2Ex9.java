import java.util.Scanner;

public class L2Ex9 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("informe o peso");
        peso = rafex.nextDouble();

        System.out.println("informe a altura");
        altura = rafex.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        rafex.close();
    }
}