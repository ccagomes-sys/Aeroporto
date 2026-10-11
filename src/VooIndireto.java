
import java.util.ArrayList;
import java.util.List;

public class VooIndireto extends Voo {
    private double taxaTransito;
    private boolean permiteEmbarqueTransito;

    public VooIndireto(String numeroVoo, String destino,
                       String horaPartida, String portaEmbarque,
                       double precoBase, Companhia companhia,
                       Aviao aviao, double taxaTransito,
                       boolean permiteEmbarqueTransito) {
        super(numeroVoo, destino, horaPartida, portaEmbarque,
                precoBase, companhia, aviao);
        this.taxaTransito = taxaTransito;
        this.permiteEmbarqueTransito = permiteEmbarqueTransito;
    }

    public boolean permiteEmbarqueTransito() {
        return permiteEmbarqueTransito;
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase()
                * (1 + getCompanhia().getTaxaLucro() / 100)
                + taxaTransito;
    }
}