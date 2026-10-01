package Dados;

public class Dados {

    // Atributos
    private double primeiroNumero;
    private double segundoNumero;
    private double opcao;

    // Construtor vazio
    public Dados() {
    }

    // Construtor
    public Dados(double primeiroNumero, double segundoNumero, double opcao) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.opcao = opcao;
    }

    // Getters e Setters

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public double getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setOpcao(double opcao) {
        this.opcao = opcao;
    }

    public double getOpcao() {
        return opcao;
    }
}