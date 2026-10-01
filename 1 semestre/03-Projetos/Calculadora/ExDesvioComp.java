package exemplo;
import java.util.Scanner;

public class ExDesvioComp {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite o número: ");
		numero = ler.nextInt();
		
		if(numero>=100) { //se número for maior ou igual a 100
			System.out.print("O número é maior ou igual a 100."); //Resposta Verdadeira
		} else { //Senão
			System.out.print("O número maenor que 100."); // Respostar Falsa
		}
		
		ler.close();
		
	}
}
