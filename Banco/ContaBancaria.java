package Banco;

<<<<<<< HEAD
public abstract class ContaBancaria {

    protected double saldo;

    public ContaBancaria (double saldoInicial){
        this.saldo = saldoInicial;
    }

    public abstract void sacar (double valor);
    public abstract void depositar (double valor);

=======
public class ContaBancaria {

    private double saldoCliente;
    private String nomeCliente;

    public ContaBancaria(String nome, double saldo){
        this.nomeCliente = nome;
        this.saldoCliente = saldo ;
    }

    

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }



    public void exibirInfoConta() {
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo da conta: " + saldoCliente);
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldoCliente+=valor;
            System.out.println("Deposito realizado, no valor de: " + valor);
            System.out.println("Novo saldo: " + saldoCliente);
        }else{
            System.out.println("Valor Inválido");
        }

        
    }

    public void sacar(double valor) {
        if((saldoCliente > 0) && (valor <= saldoCliente)) {
            setSaldoCliente(saldoCliente - valor);
            System.out.println("Saque realizado, no valor de: " + valor);
            System.out.println("Novo Saldo: " + saldoCliente);
        }else{
            System.out.println("Saldo Insuficiente: " + saldoCliente);
        }
    } 
>>>>>>> 2ec67b5 (Estrutura de Dados)
}
