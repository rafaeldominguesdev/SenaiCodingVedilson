public class L7Ex5 {
  public static void main(String[] args) {
    int soma = 0;
    int i = 0;

    while (i <= 100) {
      if (i % 2 == 0) {
        soma = soma + i;
      }
    }
    System.out.println("A soma dos números pares de 0 a 100 é: " + soma);
  }
}