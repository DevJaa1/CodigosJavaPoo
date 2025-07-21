package Banco;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca (double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            saldo-=valor;
        }else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}

