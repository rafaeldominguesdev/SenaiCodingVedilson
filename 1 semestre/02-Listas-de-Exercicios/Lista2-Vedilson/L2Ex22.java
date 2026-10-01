import java.util.Scanner;

public class L2Ex22 {
    public static void main(String[] args) {
        Scanner rafex = new Scanner(System.in);

        double distancia;
        double tempo;
        double velocidade;
        double litrosUsados;

        System.out.print("Digite o tempo gasto na viagem");
        tempo = rafex.nextDouble();

        System.out.print("Digite a velocidade média");
        velocidade = rafex.nextDouble();

        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros utilizados: " + litrosUsados + " litros");

        rafex.close();
    }
}