package SistemaDeVendas;

import java.util.List;
import java.util.ArrayList;


public class Carrinho  {

    private List<ItemCarrinho> itens;

    public Carrinho (){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem (ItemCarrinho item) {

        itens.add(item);
        System.out.println("*_*_*_*Item adicionado com sucesso! _*_*_*_");

    }
    public boolean estaVazio() {
        return itens.isEmpty();
    }
    public void removerItem (String cod) {

        boolean removido = false;

        for (ItemCarrinho x : itens) {
            if (x.getCod().equalsIgnoreCase(cod)) {
                itens.remove(x);
                removido = true;
                System.out.println("Item removido com sucesso!");
                break;
            }
        }
        if(!removido) {
            System.out.println("Lamento código não encontrado");

    }
}
    public double Total () {
        double valortotal = 0.0;

        for(ItemCarrinho y : itens) {
            valortotal += y.subTotal();
        }
        return valortotal;
    }
    public void exibirCarrinho() {
        if(itens.isEmpty()) {
            System.out.println("Estoque está vazio");
        }
        else {
            for(ItemCarrinho i : itens){
                System.out.println(i);
                System.out.println("-----------------");
            }
        }
    }
}
