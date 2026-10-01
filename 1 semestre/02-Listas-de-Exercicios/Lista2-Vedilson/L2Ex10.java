import java.util.Scanner;

public class L2Ex10 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        int not1, not2, not3, media;

        System.out.println("informe a nota 1");
        not1 = rafex.nextInt();

        System.out.println("informe a nota 2");
        not2 = rafex.nextInt();

        System.out.println("informe a nota 3");
        not3 = rafex.nextInt();

        media = (not1 + not2 + not3) / 3;

        System.out.println("sua media é: " + media);

        rafex.close();
    }
}