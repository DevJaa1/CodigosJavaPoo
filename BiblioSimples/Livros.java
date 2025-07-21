package BiblioSimples;

public class Livros {

    private String autor;
    private String isbn;
    private String titulo;
    
    public Livros (String a, String i, String t) {
        this.autor = a;
        this.titulo = t;
        this.isbn = i;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString () {
        return "\n Livro " + "\n Autor: " + autor + "\n Título: " + titulo + "\n ISBN: " + isbn ;
        
    }

}
