package ReservaViagem;

public class Onibus extends Transporte{

    private boolean leito;

     public Onibus (String origem, String destino, double precoBase, boolean leito) {
         super(origem, destino, precoBase);
         this.leito = leito;
     }

     @Override
     public double calcularPrecoTotal() {
         if(leito == true){
             return getPrecoBase() * 1.15;
         }
         return getPrecoBase();
     }

     @Override
     public String toString() {
         return "[ ÔNIBUS ] " + super.toString() +
                 " \n LEITO : " + (leito ? "SIM" : "NAO") +
                 " > > > PREÇO TOTAL: " +String.format("%.2f" , calcularPrecoTotal());

     }
}
