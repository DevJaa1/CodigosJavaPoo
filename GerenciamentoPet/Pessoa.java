package GerenciamentoPet;

public class Pessoa {

    private String nome;
    private String cpf;


    public Pessoa(String nome, String cpf) throws DadosInvalidosException {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws DadosInvalidosException {
        if(cpf == null || !cpf.matches("\\d{11}")){
            throw new DadosInvalidosException("CPF INVÁLIDO, DEVE CONTER 11 DÍGITOS!");
        }
        this.cpf = cpf;
    }

    public void exibirInformacoes () {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    }


}
