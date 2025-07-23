package GerenciamentoPet;

public class Cachorro extends Animal {

    public Cachorro (String nome, int idade, double peso, Dono dono, Veterinario vet) throws DadosInvalidosException {
        super(nome, idade, peso, dono, vet);
    }


    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    @Override
    public void emitirDados() {
        System.out.println("Cachorro: " + nome + " | idade: " + idade + "| peso: " + peso);
        System.out.println("Veterinário: " + vet.getNome() + "| Dono: " + dono.getNome());
    }


}
