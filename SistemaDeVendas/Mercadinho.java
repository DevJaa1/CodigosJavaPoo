package SistemaDeVendas;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Mercadinho {

    public static void main(String[] args) {

        Carrinho carro1 = new Carrinho();

        List<ItemCarrinho> itens = new ArrayList<>();
        Scanner ls = new Scanner(System.in);
        String escolha;

        do {

            System.out.println();
            System.out.println("------ PAINEL DE OPÇÕES -------");
            System.out.println("- Para adicionar item digite - ADICIONAR");
            System.out.println("- Para remover item digite - REMOVER");
            System.out.println("- Para exibir estoque digite - ESTOQUE");
            System.out.println("- Para sair do Sistema digite - SAIR");
            System.out.println("-------------------------------");

            System.out.println("Informe sua opção: ");
            escolha = ls.next().toUpperCase();

            switch (escolha) {

                case "ADICIONAR":

                    System.out.print("Nome do Produto: ");
                    String prd = ls.next();
                    System.out.print("Código do Produto: ");
                    String cod = ls.next();
                    System.out.print("Valor: ");
                    double valor = ls.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = ls.nextInt();

                    ItemCarrinho novoIt = new ItemCarrinho(prd, cod, valor, qtd);
                    carro1.adicionarItem(novoIt);
                    break;

                case "REMOVER":

                    if(carro1.estaVazio()){
                        System.out.println("Estoque Vazio!");
                    } else {
                        System.out.println("Informe o código do produto que deseja remover");
                        String codigo = ls.next();
                        carro1.removerItem(codigo);
                    }
                    break;

                case "ESTOQUE":
                    carro1.exibirCarrinho();
                    System.out.println();
                    break;

                case "SAIR":
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
            }
        }  while (!escolha.equalsIgnoreCase("SAIR"));
    System.out.println("Até Breve!");
    }
}