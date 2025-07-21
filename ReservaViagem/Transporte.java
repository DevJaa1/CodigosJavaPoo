package ReservaViagem;

public abstract class Transporte {

    private String origem;
    private String destino;
    private double precoBase;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public Transporte (String origem, String destino, double precoBase) {
        this.destino = destino;
        this.origem = origem;
        this.precoBase = precoBase;

    }

    public abstract double calcularPrecoTotal();

    @Override
    public String toString() {

        return "ORIGEM: " + "[ " +this.origem +" ]"
                + " --> DESTINO: " + " [ " +this.destino +" ]"+
                " >>> PREÇO: " + "[ R$ " + this.precoBase + " ]";

    }
}
