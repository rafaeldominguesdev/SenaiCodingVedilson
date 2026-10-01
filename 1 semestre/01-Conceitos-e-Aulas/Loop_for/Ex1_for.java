public class Ex1_for {
  public static void main(String[] args) {
    System.out.println("Contagem Iniciada!");
    for (int num = 0; num <= 10; num++) {
      if (num == 10) {
        System.out.println("Contando " + num + ".");
      } else {
        System.out.println("Contando " + num + "... ");
      }
    }
    System.out.println("Contagem Finalizada!");
  }
}
