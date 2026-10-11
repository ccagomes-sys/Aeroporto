
public class Escala {
    private AeroportoTransito aeroporto;
    private int ordem;

    public Escala(AeroportoTransito aeroporto, int ordem) {
        this.aeroporto = aeroporto;
        this.ordem = ordem;
    }

    public AeroportoTransito getAeroporto() {
        return aeroporto;
    }

    public int getOrdem() {
        return ordem;
    }
}