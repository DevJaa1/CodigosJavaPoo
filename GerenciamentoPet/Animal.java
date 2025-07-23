package GerenciamentoPet;

public abstract class Animal {

    protected String nome;
    protected int idade;
    protected double peso;

    protected Dono dono;
    protected Veterinario vet;

    public Animal(String nome, int idade, double peso, Dono dono, Veterinario vet) throws DadosInvalidosException {
        
        if(idade < 0 || peso < 0) {
            throw new DadosInvalidosException("Valores Inválidos, somente valores positivos");
        }
        
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dono = dono;
        this.vet = vet;

        dono.adicionarPet(this);
    }
    public abstract void emitirSom();
    public abstract void emitirDados();


    



}
