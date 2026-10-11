
public class AeroportoTransito {
    private String nome;
    private String codigo;
    private String localizacao;

    public AeroportoTransito(String nome, String codigo, String localizacao) {
        this.nome = nome;
        this.codigo = codigo;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}