package PagamentoOnline;

public class CartaoDeCredito implements Pagamento{

    private String numeroCartao;
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public CartaoDeCredito (String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    @Override

    public void processarPagamento(double valor){
        valorTotal = valor * 0.95;
    }

    @Override

    public void comprovante() {

        System.out.println("= = = = = = = = = =PAGAMENTO VIA CRÉDITO = = = = = = = = =" );
        System.out.println("Numero do cartão: " + numeroCartao);
        System.out.println("Valor com desconto: " + valorTotal);

    }

}
