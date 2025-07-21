package ContaBancaria;

public class contaPoupanca extends Conta {


    public contaPoupanca (String nome, String numeroConta, double saldo) {
        super(nome, numeroConta,saldo);

    }

    @Override

    public void depositar (double valor) {
        if(verificador){
            setSaldo(getSaldo() + valor);
            System.out.println("DEPOSITO REALIZADO");
            System.out.println("SALDO ATUALIZADO: " + this.saldo);
            System.out.println(" ");

        }
        else {
            System.out.println("CONTA INATÍVA");
            System.out.println(" ");

        }
    }

    @Override

    public void sacar (double valor){
        if(!verificador) {
            System.out.println("CONTA INATÍVA");
        } else if (valor <= getSaldo()) {
            setSaldo((getSaldo() - valor));
            System.out.println("SAQUE REALIZADO COM SUCESSO");
            System.out.println("SALDO ATUALIZADO: " + getSaldo());
            System.out.println(" ");

        }
    }

    @Override

    public void exibirInfo(){
        System.out.println("TIPO DE CONTA: POUPANÇA");
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Nome do Titular: " + this.nome);
        System.out.println("Saldo na conta: " + this.saldo);
        System.out.println("Status da Conta: " + (verificador ? "ATIVA" : "INATIVA"));
        System.out.println(" ");
    }

}
