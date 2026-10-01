package Sistema;

import Classes.Barbie;
import Classes.BarbieProfessora;

public class Aplicacao {
	public static void main(String[] args) {
		Barbie primeiraBarbie =  new Barbie();
		primeiraBarbie.nome = "Leila Barbie ";
		primeiraBarbie.profissao = "Veterinaria";
		primeiraBarbie.idade = 67;
		
		primeiraBarbie.trabalhar();
		
		BarbieProfessora segundaBarbie = new BarbieProfessora();
		
		segundaBarbie.nome = "Andressa ";
		segundaBarbie.idade = 28;
		segundaBarbie.profissao = "Professora";
		segundaBarbie.materia = "Ed Fisica";
		
		segundaBarbie.trabalhar();
		segundaBarbie.ensinar();
		
	}

}
