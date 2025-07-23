package GerenciamentoPet;

public class Veterinario extends Pessoa{

    private String crmv;

    public Veterinario(String nome, String cpf, String crmv) throws DadosInvalidosException {
        super(nome, cpf);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("Crmv do Veterinário: " + crmv);
    }
}
