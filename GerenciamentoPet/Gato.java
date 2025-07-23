package GerenciamentoPet;

public class Gato extends Animal {

    public Gato (String nome, int idade, double peso, Dono dono, Veterinario vet) throws DadosInvalidosException {
        super(nome, idade, peso, dono, vet);
    }


    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    @Override
    public void emitirDados() {
        System.out.println("Gato: " + nome + " | idade: " + idade + "| peso: " + peso);
        System.out.println("Veterinário: " + vet.getNome() + "| Dono: " + dono.getNome());
    }


}
