import java.util.Scanner;

public class Ex1_while {
  public static void main(String[] args) {
    Scanner Rafex = new Scanner(System.in);

    int numero = 1;

    while (numero >= 5 && numero <= 45) {
      System.out.println(numero);
      // numero = numero + 1; Forma simplificada numero++;
      numero++;
    }
    Rafex.close();
  }
}