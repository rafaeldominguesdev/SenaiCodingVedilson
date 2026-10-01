package prjCzadastroCarro;
import java.util.Scanner;

public class carrroSistema {
	public static void main(String[] args) {
		Scanner newScan = new Scanner (System.in);
		
			CarroInfo batata = new CarroInfo();
			
			System.out.print("Qual modelo do carro ?");
			primeiroCarro.modelo = newScan.nextLine();
			
			System.out.print("Qual a marca do carro  ?");
			primeiroCarro.marca = newScan.nextLine();
			
			System.out.print("Qual a velocidade do carro ?");
			primeiroCarro.velocidade = newScan.nextLine();
			
			
			primeiroCarro.seApresentar();
			
			System.out.println("Voce deseja: 1- Acelerar 2- Frear ");7
			
			int opcao = newScan.nextInt();
			
			if (opcao ==1) {
				System.out.print("Quanto o carro deve acelerar ?");
				int km = newScan.nextInt();
				primeiroCarro.acelerar(km);
		
				
			} else {
				System.out.print("Quanto o carro deve frear ?");
				int km = newScan.nextInt();
				primeiroCarro.frear(km);
				
			}
			
			primeiroCarro.seApresentar();
				
			newScan.close();
				
			}

	}
