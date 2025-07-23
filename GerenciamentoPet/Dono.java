package GerenciamentoPet;

import java.util.ArrayList;
import java.util.List;

public class Dono extends Pessoa{

    private List <Animal> pet = new ArrayList<>();

    public Dono(String nome, String cpf) throws DadosInvalidosException {
        super(nome, cpf);
        this.pet = new ArrayList<>();
    }

    public void adicionarPet (Animal x) {
        pet.add(x);

    }

    public List<Animal> getPet() {
        return pet;
    }



}
