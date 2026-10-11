
public class AeroportoTransito {
    private String nome;
    private String localizacao;
    private String codigo;

    public AeroportoTransito(String nome, String localizacao, String codigo) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getCodigo() {
        return codigo;
    }
}