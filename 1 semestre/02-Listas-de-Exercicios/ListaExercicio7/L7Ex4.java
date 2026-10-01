import java.util.Scanner;

public class L7Ex4 {
  public static void main(String[] args) {
    Scanner rafex = new Scanner(System.in);

    System.out.println("Digite um numero de 0 a 9:");
    int valor = rafex.nextInt();

    for (int i = 1; i <= valor; i++) {
      int multiplicacao = valor * i;
      System.out.println(valor + " * " + i + " = " + multiplicacao);
    }

    rafex.close();
  }
}
