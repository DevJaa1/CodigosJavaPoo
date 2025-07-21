package BibliotecaPublica;

public class Livro {

    String titulo;
    String autor;
    int anoPub;
    boolean disponivel;

    public Livro (String T, String A, int ano, boolean dis){
        this.titulo = T;
        this.autor = A;
        this.anoPub = ano;
        this.disponivel = dis;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    @Override
    public String toString() {
        return " Livro: " + titulo + "\n autor: " + autor + "\n Ano de Publicação: " + anoPub +"\n Disponibilidade: " + disponivel + "\n";
    }
}
