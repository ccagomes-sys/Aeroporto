import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Companhia {
    private String nome;
    private double taxaLucro;
    private List<Voo> voos;

    public Companhia(String nome, double taxaLucro) {
        this.nome = nome;
        this.taxaLucro = taxaLucro;
        voos = new ArrayList<>(10);
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaLucro() {
        return taxaLucro;
    }

    protected void setTaxaLucro(double newTaxaLucro) {
        this.taxaLucro = newTaxaLucro;
    }

    public void addVoo(String codVoo, String dest, String horaP,
                       String porta, double preco,
                       Companhia companhia, Aviao aviao, List<AeroportoTransito> airports) {
        if (airports.size() == 1)
            voos.add(new VooDireto(codVoo, dest, horaP, porta, preco, companhia, aviao));
        else
            voos.add(new VooIndireto(codVoo, dest, horaP, porta, preco, companhia, aviao, 100.0, true));
    }

    public void removeVoo(int index) {
        voos.remove(index);
    }

    public Iterator<Voo> getVoos() {
        return voos.iterator();
    }

}