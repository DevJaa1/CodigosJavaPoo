package SistemaDeVendas;

public class Produto {

    protected String nome;
    protected double preco;
    protected String cod;

    public Produto (String nome, String cod, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override

    public String toString() {
        return "Código do Produto: " + this.cod +
                "\nNome do Produto: " + this.nome +
                "\nPreço do Produto: " + this.preco;
    }

}
