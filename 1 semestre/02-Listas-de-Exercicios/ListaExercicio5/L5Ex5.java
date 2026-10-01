package pkg;



import java.util.Scanner;



public class L5Ex5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		

		System.out.print("Digite o mês: ");

		int mes = ler.nextInt();

		System.out.print("Escolha o hemisfério (N para Norte, S para Sul): ");

		String hemisferio = ler.next().toUpperCase();

		String estacao = "";

		

		if (hemisferio.equals("S")) {

		

			if (mes==12||mes==1||mes==2) {

			estacao = "Verão";

		

			} else if (mes>=3&&mes<=5) {

			estacao = "Outono";

		

			} else if (mes>=6&&mes<=8) {

			estacao = "Inverno";

		

			} else if (mes>=9&&mes<=11) {

			estacao = "Primaveira";

		

			}

		}

		else if (hemisferio.equals("N"))

			if (mes==12||mes==1||mes==2) {

			estacao = "Inverno";

			} else if (mes>=3&&mes<=5) {

			estacao = "Primaveira";

			} else if (mes>=6&&mes<8) {

			estacao = "Verão";

			} else if(mes>=9&&mes<=11) {

			estacao = "Outono";

		}

		



		

	

		System.out.println("Eatação do ano: "+estacao);

		ler.close();

	}

}