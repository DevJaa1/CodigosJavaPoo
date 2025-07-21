package ContaBancaria;

public class AppBank {

    public static void main(String[] args) {

        contaPoupanca P1 = new contaPoupanca("Joao", "200034062", 2500);
        contaCorrente CC1 = new contaCorrente("Pedro", "20043462", 1000);

        P1.exibirInfo();
        CC1.exibirInfo();

        P1.depositar(400);
        P1.sacar(2000);
        P1.exibirInfo();

        CC1.sacar(900);
        CC1.exibirInfo();













    }

}
