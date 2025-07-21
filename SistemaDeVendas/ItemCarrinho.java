package SistemaDeVendas;

public class ItemCarrinho extends Produto{

    int quantidade;


    public ItemCarrinho(String nome, String cod, double preco, int quantidade) {
        super(nome, cod, preco);
        this.quantidade = quantidade;

    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
           throw new IllegalArgumentException ("O valor deve ser maior que 0");
        }
            this.quantidade = quantidade;
    }

    public double subTotal () {
        return getPreco() * quantidade;
    }


}
