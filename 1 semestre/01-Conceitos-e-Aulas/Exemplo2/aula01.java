import java.util.Scanner; // importação biblioteca Scanner(Leitura)

public class aula01 {   //inicio
    public static void main (String[] args){   //inicio

        //Biblioteca para a leitura da entradas de dados
        Scanner ler = new Scanner(System.in);

        //Declaração das variáveis
        int numero;

        //Entrada de dados
        System.out.print("Digite um número ");
        numero = ler.nextInt();

        //Saída
        System.out.print("O número digitado: " + numero);
    }
}
