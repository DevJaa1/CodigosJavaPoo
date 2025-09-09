package Livro;
public class Livros {

    private String titulo;
    private int anoPublicado;
    private String editora;

    public Livros(String titulo, String editora, int anoPublicado){
        this.anoPublicado = anoPublicado;
        this.editora = editora;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void exibirDados(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano Publicado: " + this.anoPublicado);
    }

}
