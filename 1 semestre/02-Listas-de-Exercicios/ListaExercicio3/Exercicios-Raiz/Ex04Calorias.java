import java.util.Scanner;

public class Ex04Calorias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calPrato = 0, calSobremesa = 0, calBebida = 0;

        System.out.println("--- Exercício 4: Contador de Calorias ---");
        
        System.out.println("Escolha o prato:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        int prato = sc.nextInt();
        switch(prato) {
            case 1: calPrato = 180; break;
            case 2: calPrato = 230; break;
            case 3: calPrato = 250; break;
            case 4: calPrato = 350; break;
        }

        System.out.println("Escolha a sobremesa:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete diet (110 cal)");
        System.out.println("3 - Mousse diet (170 cal)");
        System.out.println("4 - Mousse chocolate (200 cal)");
        int sobremesa = sc.nextInt();
        switch(sobremesa) {
            case 1: calSobremesa = 75; break;
            case 2: calSobremesa = 110; break;
            case 3: calSobremesa = 170; break;
            case 4: calSobremesa = 200; break;
        }

        System.out.println("Escolha a bebida:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante diet (65 cal)");
        int bebida = sc.nextInt();
        switch(bebida) {
            case 1: calBebida = 20; break;
            case 2: calBebida = 70; break;
            case 3: calBebida = 100; break;
            case 4: calBebida = 65; break;
        }

        int totalCalorias = calPrato + calSobremesa + calBebida;
        System.out.println("Total de calorias da refeição: " + totalCalorias + " cal");

        sc.close();
    }
}
