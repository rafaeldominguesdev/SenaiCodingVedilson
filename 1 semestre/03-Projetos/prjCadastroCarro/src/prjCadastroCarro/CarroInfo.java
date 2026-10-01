pac+
kage prjCadastroCarro;

public class CarroInfo {
	
	
	//Atributos
	
	String marca;
	String modelo;
	int velocidade;
	
	//metodos
	
	void acelerar(int km) {
		velocidade += km;
	}		
	
	void frear(int km) {
		velocidade -= km;
	}
	
	void seApresentar() {
		System.out.print("O carro " + modelo + "da marca " + marca + "está a " + velocidade + "km/h");
	}
	
}
	
	
