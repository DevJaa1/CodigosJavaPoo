package Agenda;

public class Contatos {

    private String nomeContato;
    private String telefone;

    public Contatos (String nome, String numero) {
        this.nomeContato = nome;
        this.telefone = numero;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato [ Nome: " + nomeContato + 
        ", Telefone: " + telefone + " ]";
    }

    

}
