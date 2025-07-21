package BibliotecaPublica;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Biblioteca {
    private List <Livro> estante;

    public Biblioteca () {
        this.estante = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro) {
        estante.add(livro);
    }

    public void livrosDisponiveis () {
        for(Livro x : estante){
            if(x.isDisponivel()) {
                System.out.println(x);
            } else if (x.isDisponivel() == false) {
                System.out.println(x);
            }
        }
    }

    public void emprestarLivro(Livro x, Usuario y) throws InterruptedException{

        LocalDate dataEmp = LocalDate.now();

        if(x.isDisponivel() == true){
            System.out.println(" Verificando disponibilidade do livro: " + x.getTitulo());
            Thread.sleep(500);
            System.out.println(" Livro Disponível");
            Thread.sleep(500);
            y.emprestarLivro(x);
            estante.remove(x);
            System.out.println(" Livro emprestado ao Usuário: " + y.getNomeUsu() + "\n ID: " + y.getId() +"\n Data do emprestimo: " + dataEmp);
            System.out.println(" Boa Leitura!" + "\n");
            System.out.println("------------------------------------------------------");

        } else {
            System.out.println(" Livro: " + x.getTitulo() + " Indisponível!");
            System.out.println("------------------------------------------------------");

        }
    }

    public void devolverLivro (Livro x, Usuario y) {

        LocalDate dataDev = LocalDate.now();

        y.devolverLivro(x);
        estante.add(x);
        System.out.println(" Livro Devolvido: " + x.getTitulo() + "\n Usuário: " + y.getNomeUsu() + "\n ID do Usuário: " + y.getId());
        System.out.println(" Data da Devolução: " + dataDev);
        System.out.println("------------------------------------------------------");


    }

}
