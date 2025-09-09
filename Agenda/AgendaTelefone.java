package Agenda;

import java.util.ArrayList;

public class AgendaTelefone {

    private ArrayList<Contatos> contatos;

    public AgendaTelefone () {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String numero) {
       
        Contatos contatonovo = new Contatos(nome, numero);
        
        for (Contatos c : contatos) {
            if(c.getNomeContato().equalsIgnoreCase(nome)&&c.getTelefone().equalsIgnoreCase(numero)) {
                System.out.println("Contato ja existe!");
                return;  
            }
        }
        contatos.add(contatonovo);
        System.out.println("Contato Salvo com suceso!");
        

    }

    public Contatos buscarContato(String nome) {
        for(Contatos c : contatos) {
            if(c.getNomeContato().equalsIgnoreCase(nome)){
                return c;
            } else {
        }
    }
        return null;
}

    public void listarContato () {
      
        if(contatos.isEmpty()){
            System.out.println("Lista de contato vázia");
        }else{
            System.out.println("==========Agenda===========");
            int i = 1;
            for(Contatos c : contatos){
                System.out.println(i+ "." +c);
                i++;
            }
        }
    
    }

    public void excluirContato(String nome) {

        Contatos retirar = buscarContato(nome);

        if(retirar!=null) {
            contatos.remove(retirar);
            System.out.println("Contato removido");
        }else{
            System.out.println("Contato não encontrado");
        }
    }

    public void atualizarContato(String novonome, String novotelefone) {
        Contatos contatonovo = buscarContato(novonome);
        
        if(contatonovo!=null) {
            contatonovo.setTelefone(novotelefone);
            contatonovo.setNomeContato(novonome);
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Contato não encontrado");
        }
    }

}
