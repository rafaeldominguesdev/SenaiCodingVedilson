import java.util.Scanner;

public class Ex06Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 6: Calculadora Simples ---");
        System.out.print("Informe o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Informe a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case '+': resultado = n1 + n2; break;
            case '-': resultado = n1 - n2; break;
            case '*': resultado = n1 * n2; break;
            case '/': 
                if (n2 != 0) {
                    resultado = n1 / n2; 
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    valida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                valida = false;
                break;
        }

        if (valida) {
            System.out.println("Resultado: " + n1 + " " + operacao + " " + n2 + " = " + resultado);
        }

        sc.close();
    }
}
