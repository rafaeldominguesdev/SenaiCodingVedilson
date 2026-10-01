package prjProjetoCompeticao.classes;

public class Competicao {
	
	//atributos
	
    private String nome;
    private String data;
    private String cidadeSede;
    private String status;
    private ModalidadeEsportiva modalidade;
    private Atleta atleta;
    
    //Construtores
    
    

    public Competicao() {}

    public Competicao(String nome, String data, String cidadeSede,
    		String status, ModalidadeEsportiva modalidade, Atleta atleta) {
    	
        this.nome = nome;
        this.data = data;
        this.cidadeSede = cidadeSede;
        this.status = status;
        this.modalidade = modalidade;
        this.atleta = atleta;
    }

     
    //Getters & Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCidadeSede() {
        return cidadeSede;
    }

    public void setCidadeSede(String cidadeSede) {
        this.cidadeSede = cidadeSede;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModalidadeEsportiva getModalidade() {
        return modalidade;
    }

    public void setModalidade(ModalidadeEsportiva modalidade) {
        this.modalidade = modalidade;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
    
    public String toString() {
        return "Competicao{nome=" + nome
                + ", data=" + data
                + ", cidadeSede=" + cidadeSede
                + ", status=" + status
                + ", modalidade=" + modalidade
                + ", atleta=" + atleta
                + "}";
    }
    
    //metodos

    public void apresentar() {
 
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidadeSede);
        System.out.println("Data: " + data);
        System.out.println("Modalidade" + modalidade);
        System.out.println("Nome Atleta : " +  this.getAtleta());

        
    }
}
