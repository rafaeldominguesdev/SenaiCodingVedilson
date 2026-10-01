package prjProjetoCompeticao.classes;

public class Atleta {
    private String nomeCompleto;
    private String dataNascimento;
    private String nacionalidade;
    private String registroFederacao;
    private static int contador = 1000;

    {
        registroFederacao = "RegistroFederacaao7" + contador;
        contador++;
    }

    public Atleta() {
    	
    }

    public Atleta(String nomeCompleto, String dataNascimento, String nacionalidade) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public Atleta(String nomeCompleto, String dataNascimento, String nacionalidade,
    		String registroFederacao) {
    	
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.registroFederacao = registroFederacao;
    }

    public String toString() {
        return "Atleta{nomeCompleto=" + nomeCompleto
                + ", dataNascimento=" + dataNascimento
                + ", nacionalidade=" + nacionalidade
                + ", registroFederacao=" + registroFederacao
                + "}";
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRegistroFederacao() {
        return registroFederacao;
    }

    public void setRegistroFederacao(String registroFederacao) {
        this.registroFederacao = registroFederacao;
    }
}
