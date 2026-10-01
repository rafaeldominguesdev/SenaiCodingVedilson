package lista6;

import java.util.Scanner;

public class L6Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double imposto, renda;

        System.out.println("Exercicio L6Ex2 ---- Imposto de renda");
        System.out.print("Informe o valor da renda em  R$: ");
        renda = sc.nextDouble();

        
        if (renda >= 2001 && renda <=5000 ) {
        	imposto = renda*1.10;
        	System.out.printf("Sua renda + imposto aplicado é : %.2f ",imposto);
        }else if (renda >= 5001 && renda <=10000){
        	imposto = renda*1.10;
        	System.out.printf("Sua renda + imposto aplicado é : %.2f" , imposto);
        }else if (renda >=10000 ){
        	 imposto = renda*1.30;
        	 System.out.printf("Sua renda + imposto aplicado é : %.2f " , imposto);
        }else if (renda<=2000){
        	System.out.print("Isento de imposto");
        }  	

        sc.close();
    }
}