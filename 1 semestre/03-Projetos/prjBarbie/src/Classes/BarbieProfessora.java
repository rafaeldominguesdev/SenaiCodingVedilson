package Classes;

public class BarbieProfessora extends Barbie {
	
	// atributos
	public String materia;
	
	@Override

	public void trabalhar() {
		System.out.println(nome + "esta ensinando " + materia);
	}

}
