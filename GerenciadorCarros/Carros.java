package GerenciadorCarros;

public class Carros {

    private String marca;
    private String cor;
    private int anoLanc;
    private double preco;

    public Carros(String marca, String cor, int ano, double preco) {
        this.anoLanc = ano;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    public int getAno() {return anoLanc;}
    public void setAno(int ano) {this.anoLanc = ano;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

@Override
public String toString() {
    return "Marca: " + marca + "\n" +
           "Ano: " + anoLanc + "\n" +
           "Cor: " + cor + "\n" +
           "Preço: R$ " + String.format("%,.2f", preco) +"\n";
}

    
}
