package Banco;

import java.util.ArrayList;
import java.util.List;


public class Banco {

    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaPoupanca(1000));
        contas.add(new ContaCorrente(2000));

        contas.get(0);
        contas.get(1);
        contas.get(1).sacar(100);
        contas.get(0).sacar(100);

        for (ContaBancaria contaBancaria : contas) {
            System.out.println(contaBancaria.saldo);
        }


    }

}
