public class L7ex6 {
  public static void main(String[] args) {

    int soma = 0;

    for (int i = 0; i <= 100; i = i + 1) {
      if (i % 2 == 0) {
        soma = soma + i;
      }
    }
    System.out.println("A soma dos numeros pares de 0 a 100 e: " + soma);
  }
}A