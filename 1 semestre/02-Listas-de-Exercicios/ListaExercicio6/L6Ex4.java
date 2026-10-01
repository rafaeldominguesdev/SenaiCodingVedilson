package lista6;

import java.util.Scanner;

public class L6Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double score;
        System.out.println("Exercicio L6Ex3 ---- Notas Final ");
        System.out.print("Informe a sua nota: ");
        score = sc.nextDouble();
        
        if (score<=400) {
        	System.out.print("Risco Alto");
        }else if (score>= 401 && score <=699) {
        	System.out.print("Risco medio " ) ;
        }else if (score>= 700 && score <=849) {
        	System.out.print("Baixo risco");
        }else if (score>=850) {
        	System.out.print("Score top");
        }

         	

        sc.close();
    }
}
