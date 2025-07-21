package ReservaViagem;

public class Aviao extends Transporte {

    private boolean classExecutiva;

    public Aviao (String origem, String destino, double precoBase, boolean classExecutiva) {
        super(origem, destino, precoBase);
        this.classExecutiva = classExecutiva;
    }


    @Override
    public double calcularPrecoTotal () {

        if(classExecutiva == true) {
            return getPrecoBase() * 1.3;
        }
        return getPrecoBase();
    }

    @Override
    public String toString() {
        return "[ AVIÃO ] " + super.toString() +
                " \n CLASSE EXECUTIVA: " + (classExecutiva ? "SIM" : "NAO") +
                " > > > PREÇO TOTAL CLASSE EXECUTIVA: " +String.format("%.2f" , calcularPrecoTotal());

    }
}
