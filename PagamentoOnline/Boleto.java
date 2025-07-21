package PagamentoOnline;

public class Boleto implements Pagamento{

    private String codigoBarras;
    private double valorBol;

    public double getValorBol() {
        return valorBol;
    }

    public void setValorBol(double valorBol) {
        this.valorBol = valorBol;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Boleto (String codigoBarras) {
        this.codigoBarras = codigoBarras;

    }

    @Override

    public void processarPagamento(double valor) {

        valorBol = valor * 1.02;

    }

    @Override
    public void comprovante() {

        System.out.println(" = = = = = = = = PAGAMENTO VIA BOLETO = = = = = = = = =");
        System.out.println("COD: " + codigoBarras);
        System.out.printf("Valor com taxa: R$ %.2f \n" , valorBol);



    }

}
