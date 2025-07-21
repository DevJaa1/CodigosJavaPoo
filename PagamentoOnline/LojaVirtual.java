package PagamentoOnline;

public class LojaVirtual {

  public void executarPagamento (Pagamento metodo, double valor) {
      metodo.processarPagamento(500);
      metodo.comprovante();
      System.out.println();
  }

}
