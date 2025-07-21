package BibliotecaPublica;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Usuario {

    private String nomeUsu;
    private String id;
    private List<Livro>livrosEmprestados;

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario (String nomeUsu, String id) {
        this.nomeUsu = nomeUsu;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();


    }

    public void emprestarLivro(Livro book) throws InterruptedException{
        if(book.isDisponivel() == true) {
            livrosEmprestados.add(book);
            Thread.sleep(500);
            book.setDisponivel(false);
        } else{
            System.out.println("Livro Indisponível no momento!\nMas não desanime, dê uma olhada nos outros Livros");
        }
    }

    public void devolverLivro(Livro dbook) {

       LocalDate dataDev = LocalDate.now();

        livrosEmprestados.remove(dbook);
        dbook.setDisponivel(true);


    }
    @Override
    public String toString() {
        return "Id: "+ id + "\n Usuário: " + nomeUsu+ "\n";
    }

}
