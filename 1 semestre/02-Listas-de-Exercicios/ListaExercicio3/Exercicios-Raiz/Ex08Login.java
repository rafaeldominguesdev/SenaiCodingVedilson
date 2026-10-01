import java.util.Scanner;

public class Ex08Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 8: Sistema de Login ---");
        
        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }

        sc.close();
    }
}
