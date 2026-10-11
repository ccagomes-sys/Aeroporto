
public class VooDireto extends Voo {

    public VooDireto(String numeroVoo, String destino,
                     String horaPartida, String portaEmbarque,
                     double precoBase, CompanhiaAerea companhia,
                     Aeronave aeronave) {
        super(numeroVoo, destino, horaPartida, portaEmbarque,
                precoBase, companhia, aeronave);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase()
                * (1 + getCompanhia().getTaxaLucro() / 100);
    }
}