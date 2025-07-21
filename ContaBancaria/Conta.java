package ContaBancaria;
public abstract class Conta {

    protected String nome;
    protected String numeroConta;
    protected double saldo;
    protected boolean verificador;

    public Conta(String nome, String numeroConta, double saldo){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.verificador = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInfo (){

        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Nome do Titular: " + this.nome);
        System.out.println("Saldo na conta: " + this.saldo);
        System.out.println("Status da Conta: " + (verificador ? "ATIVA" : "INATIVA"));
        System.out.println(" ");
    }

    public void depositar(double valor){
        if (verificador == true) {
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado!");
            System.out.println("SALDO ATUALIZADO: " + this.saldo);
        } else {
            System.out.println("CONTA INATÍVA");
        }
    }

    public void sacar (double valor) {
       if(!verificador) {
           System.out.println("CONTA INATÍVA");
       } else if (valor <= this.saldo) {
           setSaldo(getSaldo() - valor);
           System.out.println("SAQUE REALIZADO COM SUCESSO!");
           System.out.println("SALDO ATUALIZADO: " + this.saldo);
       } else {
           System.out.println("SALDO INSUFICIENTE");
       }

    }
}
