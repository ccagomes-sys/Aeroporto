
public abstract class Voo {
    private String numeroVoo;
    private String destino;
    private String horaPartida;
    private String portaEmbarque;
    private double precoBase;
    private Companhia companhia;
    private Aviao aviao;

    public Voo(String numeroVoo, String destino, String horaPartida,
               String portaEmbarque, double precoBase,
               Companhia companhia, Aviao aviao) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.portaEmbarque = portaEmbarque;
        this.precoBase = precoBase;
        this.companhia = companhia;
        this.aviao = aviao;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public String getPortaEmbarque() {
        return portaEmbarque;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public Aviao getAeronave() {
        return aviao;
    }

    public double custoTotal() {
        return getPrecoBase()
                * (1 + getCompanhia().getTaxaLucro() / 100);
    }
}