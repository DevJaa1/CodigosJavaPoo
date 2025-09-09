package GerenciadorCarros;

public class Main {
    public static void main(String[] args) {
        
        TADCarros listadecarros = new TADCarros();        
         
        listadecarros.inserirCarros("Renault", "Prata", 2010, 45990);
        listadecarros.inserirCarros("Chevrolet", "Cinza", 2020, 78990);
        listadecarros.inserirCarros("Volkswagen", "Branco", 2022, 89950);
        listadecarros.inserirCarros("GMC", "Cinza", 2019, 89950);
        listadecarros.inserirCarros("GMC", "Branco", 2020, 90950);
        listadecarros.inserirCarros("BMW", "Azul", 2026, 120550);
        
        System.out.println();
        System.out.println("Lista de carros");
        System.out.println();
        listadecarros.listarCarros();   
        
        
        System.out.println("****************** CARROS POR ANO **********************");
        listadecarros.buscaPorAno(2020);
        
        
        System.out.println();
        System.out.println("****************** CARROS POR COR **********************");
        listadecarros.buscarPorCor("BRANCO");
        
        
        System.out.println();
        System.out.println("****************** CARROS POR MARCA **********************");
        listadecarros.buscarCarrosMarca("GMC");

        System.out.println();
        System.out.println("****************** CARROS POR PREÇO **********************");
        listadecarros.buscarPorPreco(30000, 90000);

    
    }

}
