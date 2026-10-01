import java.util.Scanner;

public class Ex11MenuOpcoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 11: Menu de Opções ---");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção selecionada: Ver saldo.");
                break;
            case 2:
                System.out.println("Opção selecionada: Depositar.");
                break;
            case 3:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}
