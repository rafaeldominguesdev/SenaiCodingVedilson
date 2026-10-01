import java.util.Scanner;

public class Ex02PesoFavoravel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 2: IMC Corporais ---");
        System.out.print("Informe seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Informe sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Status: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Status: Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Status: Sobrepeso");
        } else if (imc >= 30 && imc <= 40) {
            System.out.println("Status: Obesidade");
        } else {
            System.out.println("Status: Obesidade Mórbida");
        }

        sc.close();
    }
}
