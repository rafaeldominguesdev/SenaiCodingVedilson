package prjJogoNaruto.classes;

public class Ninja {
	
	//Atributos
	
	public String nome;
	public int vida;
	public int magia;
	private int poderOculto;
	
	//Construtores
	public Ninja() {
		
	}
	
	public Ninja(String pNome, int pVida, int pMagia) {
		 
		nome = pNome;
		vida = pVida;
		magia = pMagia;
		
		
	}
	
	// Getters e Setters
	
	public void setPoderOculto(int pPoderOculto) {
		
		poderOculto = pPoderOculto;
	}
	
	public int getPoderOculto() {
		return poderOculto;
		
	}
	
	
	
	//Metodos
	public void atacar(String golpe) {
		System.out.println(this.nome + " atacou usando " + golpe + "!");
	}
	
	public void atacar(Ninja atacante, Ninja atacado) {
		System.out.println(atacante.nome + " atacou " + atacado.nome);
		atacado.vida -= 100;
		System.out.println("A vida atual do ninja " + atacado.nome +" é : " + atacado.vida);
	}
	
}
