package prjProjetoCompeticao.classes;

public class ModalidadeEsportiva {
    private String nome;
    private String categoria;
    private String genero;
    private String descricaoRegras;

    public ModalidadeEsportiva() {
   
    }
    
    
    public ModalidadeEsportiva(String nome, String categoria, String genero,
    		String descricaoRegras) {
    	
        this.nome = nome;
        this.categoria = categoria;
        this.genero = genero;
        this.descricaoRegras = descricaoRegras;
    }

    public String toString() {
        return "ModalidadeEsportiva{nome=" + nome
                + ", categoria=" + categoria
                + ", genero=" + genero
                + ", descricaoRegras=" + descricaoRegras
                + "}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricaoRegras() {
        return descricaoRegras;
    }

    public void setDescricaoRegras(String descricaoRegras) {
        this.descricaoRegras = descricaoRegras;
    }
}
