package PagamentoOnline;

public class LojaFuncional {

    public static void main(String[] args) {

        LojaVirtual loja1 = new LojaVirtual();

        Pagamento card = new CartaoDeCredito("5502-1757-0339-9226");
        Pagamento bolet = new Boleto("83690000002 123456789000 123456789000");

        System.out.println("Pagamentos realizados com sucesso!");

        loja1.executarPagamento(card,500);
        loja1.executarPagamento(bolet,600);


    }

}
