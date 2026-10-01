package lista6;

import java.util.Scanner;

public class L6Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota;
        System.out.println("Exercicio L6Ex3 ---- Notas Final ");
        System.out.print("Informe a sua nota: ");
        nota = sc.nextDouble();
        
        if (nota<=50) {
        	System.out.print("Reprovado VOCE É BURRO DEMAIS SLK");
        }else if (nota>= 50 && nota <=69) {
        	System.out.print("Recuperação VOCE É MENOS BURRO" ) ;
        }else if (nota>= 70 && nota <=89) {
        	System.out.print("Aprovado vocé é inteligente");
        }else if (nota>=90) {
        	System.out.print("Aprovado VOCE É PICA");
        }

         	

        sc.close();
    }
}