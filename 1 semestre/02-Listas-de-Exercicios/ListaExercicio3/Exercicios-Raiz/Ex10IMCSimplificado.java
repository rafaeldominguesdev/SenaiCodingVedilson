import java.util.Scanner;

public class Ex10IMCSimplificado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 10: Classificação IMC Simplificada ---");
        System.out.print("Informe o IMC: ");
        double imc = sc.nextDouble();

        if (imc < 18) {
            System.out.println("Classificação: Magro");
        } else if (imc >= 18 && imc <= 25) {
            System.out.println("Classificação: Normal");
        } else {
            System.out.println("Classificação: Acima do peso");
        }

        sc.close();
    }
}
