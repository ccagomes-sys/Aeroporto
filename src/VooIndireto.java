
import java.util.ArrayList;
import java.util.List;

public class VooIndireto extends Voo {
    private double taxaTransito;
    private boolean permiteEmbarqueTransito;
    private List<Escala> escalas;

    public VooIndireto(String numeroVoo, String destino,
                       String horaPartida, String portaEmbarque,
                       double precoBase, CompanhiaAerea companhia,
                       Aeronave aeronave, double taxaTransito,
                       boolean permiteEmbarqueTransito) {
        super(numeroVoo, destino, horaPartida, portaEmbarque,
                precoBase, companhia, aeronave);
        this.taxaTransito = taxaTransito;
        this.permiteEmbarqueTransito = permiteEmbarqueTransito;
        this.escalas = new ArrayList<>();
    }

    public void adicionarEscala(Escala escala) {
        escalas.add(escala);
    }

    public List<Escala> getEscalas() {
        return escalas;
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