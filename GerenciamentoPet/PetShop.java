package GerenciamentoPet;

public class PetShop {
    public static void main(String[] args) {

        try {

            Dono d1 = new Dono("Joao Pedro", "10023202599");
            Veterinario v1 = new Veterinario("Dr.Carlos","10023202599" ,"crmv231234");

            Animal gato = new Gato("Milu", 12, 4.21, d1, v1);

            gato.emitirDados();
            gato.emitirSom();

        } catch (DadosInvalidosException e) {
            System.err.println("Erro de cadastro: " + e.getMessage());

        }



    }
}
