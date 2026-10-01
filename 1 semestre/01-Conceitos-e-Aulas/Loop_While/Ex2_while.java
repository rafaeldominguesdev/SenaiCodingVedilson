
import java.util.Scanner;

public class Ex2_while {
  public static void main(String[] args) {
    Scanner Rafex = new Scanner(System.in);

    int numero = 10;

    while (numero >= 1) {
      System.out.println(numero);
      numero--;
    }
    Rafex.close();
  }
}