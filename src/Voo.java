
public abstract class Voo {
    private String numeroVoo;
    private String destino;
    private String horaPartida;
    private String portaEmbarque;
    private double precoBase;
    private CompanhiaAerea companhia;
    private Aeronave aeronave;

    public Voo(String numeroVoo, String destino, String horaPartida,
               String portaEmbarque, double precoBase,
               CompanhiaAerea companhia, Aeronave aeronave) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.portaEmbarque = portaEmbarque;
        this.precoBase = precoBase;
        this.companhia = companhia;
        this.aeronave = aeronave;
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

    public CompanhiaAerea getCompanhia() {
        return companhia;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public abstract double calcularCusto();
}