
import java.util.Scanner;

public class Ex1_do_while {
    public static void main (String[] args ) {
        Scanner rafex = new Scanner(System.in);

        int opcao;
        System.out.println("Exemplo cm do-while");

        do {
            System.out.println("Menu");
            System.out.println("1 - Opção 1 ");
            System.out.println("2 - Opção 2 ");
            System.out.println("3 - Sair ");
            System.out.println("Digite a opção:");
            opcao = rafex.nextInt();
            if (opcao == 1){
                System.out.println("Você escolheu a opção 1.");
            } else if ( opcao == 2){
                System.out.println("Você escolheu a opção 2.");
            } else {
                System.out.println("Você escolheu sair do programa.");
            }


        } while ( opcao != 3 );

        System.out.println("Saindo do programa!");
        rafex.close();
    }
}
