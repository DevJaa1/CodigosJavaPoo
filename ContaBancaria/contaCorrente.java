package ContaBancaria;

public class contaCorrente extends Conta {

    double taxa = 2.5;

    public contaCorrente(String nome, String numeroConta, double saldo) {
        super(nome,numeroConta,saldo);

    }

    @Override

    public void depositar (double valor) {
        if(verificador){
            setSaldo(getSaldo() + valor);
            System.out.println("DEPOSITO REALIZADO");
            System.out.println("SALDO ATUALIZADO: " + getSaldo());
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
            setSaldo((getSaldo() - valor) - taxa);
            System.out.println("SAQUE REALIZADO COM SUCESSO");
            System.out.println("SALDO ATUALIZADO: " + getSaldo());
            System.out.println(" ");

        }
    }
}
