package Banco;

public class ContaCorrente extends ContaBancaria {

    private double taxa = 2;

    public ContaCorrente (double saldoInicial) {
        super(saldoInicial);


    }

    @Override
    public void sacar(double valor) {
        double total = valor + taxa;

            if(valor <= saldo) {
                saldo -= valor;
            } else{
                System.out.println("Saldo Insuficiente");
            }
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }
}
