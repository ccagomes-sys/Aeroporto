
public class VooDireto extends Voo {

    public VooDireto(String numeroVoo, String destino,
                     String horaPartida, String portaEmbarque,
                     double precoBase, Companhia companhia,
                     Aviao aviao) {
        super(numeroVoo, destino, horaPartida, portaEmbarque,
                precoBase, companhia, aviao);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase()
                * (1 + getCompanhia().getTaxaLucro() / 100);
    }
}