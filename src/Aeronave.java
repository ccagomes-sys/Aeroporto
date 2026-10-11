
public class Aeronave {
    private String fabricante;
    private String modelo;
    private int capacidade;

    public Aeronave(String fabricante, String modelo, int capacidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }
}