import java.util.Scanner;

public class L7Ex3 {
  public static void main(String[] args) {
    Scanner rafex = new Scanner(System.in);

    System.out.println("Digite um numero de 0 a 9:");
    int valor = rafex.nextInt();

    int i = 1;
    while (i <= 10) {
      int multiplicacao = valor * i;
      System.out.println(valor + " * " + i + " = " + multiplicacao);
      i++;
    }

    rafex.close();
  }
}
