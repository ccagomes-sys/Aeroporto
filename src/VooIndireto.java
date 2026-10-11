
public class VooIndireto extends Voo {
    private double taxaTransito;
    private boolean permiteEmbarqueTransito;

    public VooIndireto(String codVoo, String dest,
                       String horaP, String porta,
                       double preco, Companhia companhia,
                       Aviao aviao, double taxaTransito,
                       boolean permiteEmbarqueTransito) {
        super(codVoo, dest, horaP, porta,
                preco, companhia, aviao);
        this.taxaTransito = taxaTransito;
        this.permiteEmbarqueTransito = permiteEmbarqueTransito;
    }

    public boolean permiteEmbarqueTransito() {
        return permiteEmbarqueTransito;
    }

    @Override
    public double custoTotal() {
        return getPreco() +
                (getPreco() * getCompanhia().getTaxaLucro()) +
                (getPreco() * taxaTransito);
    }
}