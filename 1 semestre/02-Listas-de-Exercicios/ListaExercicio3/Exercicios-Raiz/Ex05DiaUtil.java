import java.util.Scanner;

public class Ex05DiaUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 5: Dia Útil ou Fim de Semana ---");
        System.out.print("Informe um número de 1 a 7 (1=Domingo, 7=Sábado): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil (Segunda a Sexta)");
                break;
            case 1:
            case 7:
                System.out.println("Fim de Semana (Sábado ou Domingo)");
                break;
            default:
                System.out.println("Número inválido! Digite entre 1 e 7.");
                break;
        }

        sc.close();
    }
}
