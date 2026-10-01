import java.util.Scanner;

public class L7Ex2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    for (int i = 0; i < 50; i = i + 1) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    for (int a = 50; a < 100; a = a + 1) {
      if (a % 2 == 1) {
        System.out.println(a);
      }
    }
    ler.close();
  }
}
