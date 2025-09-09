package GerenciadorCarros;

import java.util.ArrayList;
import java.util.List;

public class TADCarros {

    private ArrayList <Carros> listadecarros;

    public TADCarros () {
        this.listadecarros = new ArrayList<>();
    }

    public void buscarCarrosMarca(String marca) {

        List <Carros> encontrados = new ArrayList<>();

        for(Carros x : listadecarros){
            if(x.getMarca().equalsIgnoreCase(marca)){
                encontrados.add(x);
                System.out.println(
                    ""+
                    "Marca: " + x.getMarca() + "\n" +
                    "Ano: " + x.getAno() + "\n" +
                    "Cor: " + x.getCor() + "\n" +
                    "Preço: R$ " + String.format("%,.2f", x.getPreco()) +"\n" +
                    "");

            }
        } if(encontrados.isEmpty()){
            System.out.println("Marca especificada não encontrada!");
        }
    }

    public void buscaPorAno(int ano) {

        List <Carros> listaPorAno = new ArrayList<>();

        for(Carros x : listadecarros) {
            if(x.getAno() == ano){
                listaPorAno.add(x);
                System.out.println(
                    ""+
                    "Marca: " + x.getMarca() + "\n" +
                    "Ano: " + x.getAno() + "\n" +
                    "Cor: " + x.getCor() + "\n" +
                    "Preço: R$ " + String.format("%,.2f", x.getPreco()) +"\n" +
                    "");
            }
        } if(listaPorAno.isEmpty()){
            System.out.println("Ano especificado não encontrado!");
        }
    }

    public void buscarPorCor(String cor) {
        List <Carros> listaporcor = new ArrayList<>();

        for(Carros x : listadecarros) {
            if(x.getCor().equalsIgnoreCase(cor)) {
                listaporcor.add(x);
                 System.out.println(
                    ""+
                    "Marca: " + x.getMarca() + "\n" +
                    "Ano: " + x.getAno() + "\n" +
                    "Cor: " + x.getCor() + "\n" +
                    "Preço: R$ " + String.format("%,.2f", x.getPreco()) +"\n" +
                    "");
            }
            }if(listaporcor.isEmpty()){
                    System.out.println("Cor especificada não encontrada!");
                }
        }

    public void buscarPorPreco(double precomenor, double precomaior) {
        List<Carros> listadecarropreco = new ArrayList<>();

        for(Carros y : listadecarros){
            if(y.getPreco() >= precomenor && y.getPreco() <= precomaior){
                listadecarropreco.add(y);
                System.out.println(
                    ""+
                    "Marca: " + y.getMarca() + "\n" +
                    "Ano: " + y.getAno() + "\n" +
                    "Cor: " + y.getCor() + "\n" +
                    "Preço: R$ " + String.format("%,.2f", y.getPreco()) +"\n" +
                    "");
            }
        }if(listadecarropreco.isEmpty()){
            System.out.println("Não encontrado!");
        }

    }

    public void listarCarros() {
        if(listadecarros.isEmpty()){
            System.out.println("Nenhnum carro cadastrado!");
        } else {
            int i = 1;
            for(Carros x : listadecarros) {
                System.out.println(i + "." + x);
                i++;
            }
        }
    }

    public void inserirCarros(String nome, String cor, int ano, double preco) {
        Carros carronovo = new Carros(nome, cor, ano, preco);
        listadecarros.add(carronovo);
        System.out.println("Carro adicinado a Lista com sucesso!");

    }

}
