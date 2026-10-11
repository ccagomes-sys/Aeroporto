
public class CompanhiaAerea {
    private String nome;
    private double taxaLucro;

    public CompanhiaAerea(String nome, double taxaLucro) {
        this.nome = nome;
        this.taxaLucro = taxaLucro;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaLucro() {
        return taxaLucro;
    }

    public void setTaxaLucro(double taxaLucro) {
        this.taxaLucro = taxaLucro;
    }
}