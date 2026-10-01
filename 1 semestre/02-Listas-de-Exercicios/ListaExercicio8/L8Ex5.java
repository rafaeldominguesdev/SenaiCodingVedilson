import java.util.Scanner;

public class L8Ex5 {
    public static void main(String[] args) {
        Scanner rafael = new Scanner(System.in);

        int num1, num2, opcao;

        do {
            System.out.println("********************");
            System.out.println("Menu da Calculadora");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Exponenciação");
            System.out.println("0 - Sair");
            System.out.println("********************");

            System.out.println("Digite a opção desejada: ");
            opcao = rafael.nextInt();
            System.out.println("Digite o primeiro número: ");
            num1 = rafael.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = rafael.nextInt();

            if (opcao < 1 && opcao > 5) {
                System.out.println("Opção inválida");
            }

            switch (opcao) {
                case 1:
                    System.out.println("A soma é: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("A subtração é: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("A multiplicação é: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("A divisão é: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("A exponenciação é: " + Math.pow(num1, num2));
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
            }

        } while (opcao != 0);

        rafael.close();

    }
}
