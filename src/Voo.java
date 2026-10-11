
public abstract class Voo {
    private String codVoo;
    private String dest;
    private String horaP;
    private String porta;
    private double preco;
    private Companhia companhia;
    private Aviao aviao;

    public Voo(String codVoo, String dest, String horaP,
               String porta, double preco,
               Companhia companhia, Aviao aviao) {
        this.codVoo = codVoo;
        this.dest = dest;
        this.horaP = horaP;
        this.porta = porta;
        this.preco = preco;
        this.companhia = companhia;
        this.aviao = aviao;
    }

    public String getCodVoo() {
        return codVoo;
    }

    public String getDest() {
        return dest;
    }

    public String getHoraP() {
        return horaP;
    }

    public String getPorta() {
        return porta;
    }

    public double getPreco() {
        return preco;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public double custoTotal() {
        return preco + preco * companhia.getTaxaLucro();
    }
}