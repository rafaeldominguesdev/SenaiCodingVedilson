import java.util.Scanner;

public class ExercicioResta {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    double compra;
    double desconto;
    double valorfinal;

    System.out.println("Informe o valor da compra:");
    compra = sc.nextDouble();

    if (compra > 100) {
      desconto = compra * 0.10;
      valorfinal = compra - desconto;
      System.out.println("Você recebeu um desconto de 10%!");
      System.out.println("Valor final da sua compra foi de: " + valorfinal);
    } else {
      desconto = 0;
      valorfinal = compra;

      System.out.println("Sem desconto.");
      System.out.println("Valor final da sua compra foi de: " + valorfinal);
    }
    sc.close();
  }
}