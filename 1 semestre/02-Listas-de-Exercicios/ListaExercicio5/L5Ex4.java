package pkg;

import java.util.Scanner;

public class L5ex4 {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		double temperatura, um, dois, tres, quatro, cinco, seis;
		int opcao;
		
		System.out.println("Esxolha a conversão desejada:");
		System.out.println("1 - Celsius para Fahrenheit");
		System.out.println("2 - Celsius para Kelvin");
		System.out.println("3 - Fahrenheit para Celsius");
		System.out.println("4 - Fahrenheit para Kelvin");
		System.out.println("5 - Kelvin para Celsius");
		System.out.println("6 - Kelvin para Fahrenheit");
		System.out.println("Digite a opção: ");
		opcao = ler.nextInt();
		System.out.println("Digite a temperatura: ");
		temperatura = ler.nextDouble();
		
		switch (opcao) {
			case 1:
				um = (temperatura*1.8)+32;
				System.out.print("A temperatura é: "+um);
				break;
			case 2:
				dois = temperatura + 273.15;
				System.out.println("A temperatura é: " + dois);
				break;
			case 3:
				tres = (temperatura-32)/1.8;
				System.out.println("A temperatura é: " + tres);
				break;
			case 4:
				quatro = ((temperatura-32)/1.8)+273.15;
				System.out.print("A temperatura é: "+quatro);
				break;
			case 5:
				cinco = temperatura - 273.15;
				System.out.println("A temperatura é: "+cinco);
				break;
			case 6:
				seis = ((temperatura-273.15)*1.8)+32;
				System.out.print("A temperatura é: "+seis);
				break;
		
	}
		ler.close();
}

}
