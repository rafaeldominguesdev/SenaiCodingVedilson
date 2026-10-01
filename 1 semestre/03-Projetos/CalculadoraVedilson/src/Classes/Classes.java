package Classes;

public class Classes {

    // Atributos
    private int soma;
    private int subtracao;
    private int divisao;
    private int multiplicacao;

    // Construtor
    public Classes() {

    }

    // Getters
    public int getSoma() {
        return soma;
    }

    public int getSubtracao() {
        return subtracao;
    }

    public int getDivisao() {
        return divisao;
    }

    public int getMultiplicacao() {
        return multiplicacao;
    }

    // Seters
    
    public void setSoma(int pSoma) {
        soma = pSoma;
    }

    public void setSubtracao(int pSubtracao) {
        subtracao = pSubtracao;
    }

    public void setDivisao(int pDivisao) {
        divisao = pDivisao;
    }

    public void setMultiplicacao(int pMultiplicacao) {
        multiplicacao = pMultiplicacao;
    }

    // Métodos
    public void somar(int a, int b) {
        soma = a + b;
    }

    public void subtrair(int a, int b) {
        subtracao = a - b;
    }

    public void dividir(int a, int b) {
        divisao = a / b;
    }

    public void multiplicacao(int a, int b) {
        multiplicacao = a * b;
    }
}