public class VooIndireto extends Voo {
    private double taxaReabastecimento;
    private boolean embarquePermitido;

    public VooIndireto(String numeroVoo, String destino,
                       String horaPartida, String portaEmbarque,
                       double precoBase, Companhia companhia,
                       Aviao aviao, double taxaTransito,
                       boolean permiteEmbarqueTransito) {
        super(numeroVoo, destino, horaPartida, portaEmbarque,
                precoBase, companhia, aviao);
        this.taxaReabastecimento = taxaTransito;
        this.embarquePermitido = permiteEmbarqueTransito;
    }

    public boolean permiteEmbarqueTransito() {
        return embarquePermitido;
    }


    public double custoTotal() {
        return getPrecoBase()
                * (1 + getCompanhia().getTaxaLucro() / 100)
                + taxaReabastecimento;
    }
}