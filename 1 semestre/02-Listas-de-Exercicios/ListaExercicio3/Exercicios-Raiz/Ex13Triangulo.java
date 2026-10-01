import java.util.Scanner;

public class Ex13Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 13: Tipo de Triângulo ---");
        System.out.print("Informe o lado 1: ");
        double l1 = sc.nextDouble();

        System.out.print("Informe o lado 2: ");
        double l2 = sc.nextDouble();

        System.out.print("Informe o lado 3: ");
        double l3 = sc.nextDouble();

        // Verificação se é um triângulo (opcional mas bom senso)
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo Equilátero (3 lados iguais)");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo Isósceles (2 lados iguais)");
            } else {
                System.out.println("Triângulo Escaleno (lados diferentes)");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo válido.");
        }

        sc.close();
    }
}
