package BiblioSimples;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class bddLivros {
    private List<Livros> conteudo;
    
    public bddLivros () {
        this.conteudo = new ArrayList<>();
    }

    public void cadastrar (Livros c) {
        conteudo.add(c);
    }

    public void removerLivro(Livros isbn) {
        conteudo.remove(isbn);
    }

    public List<Livros> listarLivroBdd () {
        return conteudo;
    }
   
    public boolean estaVazio (){
        return conteudo.isEmpty();
    }
    public boolean removerLivros(String isbn) {
        for(Livros x : conteudo) {
            if(x.getIsbn().equals(isbn)) {
                conteudo.remove(x);
                return true;
            } 
        }
        return false;
    }

}
