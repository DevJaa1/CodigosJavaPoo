package Banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Joao", 1000);
        c1.exibirInfoConta();
        System.out.println();
        c1.depositar(150);
        System.out.println();
        c1.sacar(1000);
        System.out.println();
        c1.exibirInfoConta();

    }

}
