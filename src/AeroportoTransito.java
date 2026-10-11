
public class AeroportoTransito {
    private String nome;
    private String localizacao;

    public AeroportoTransito(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}