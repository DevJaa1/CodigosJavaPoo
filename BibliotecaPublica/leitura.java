package BibliotecaPublica;

public class leitura {

    public static void main(String[] args) throws InterruptedException {

        Biblioteca BibliotecaPublica = new Biblioteca();

        Livro livro1 = new Livro("O cu da cobra", "Machado de Assis", 2007,true);
        Livro livro2 = new Livro("As cinzas do Cinzeiro", "Chris Otwerson", 2012,true);
        Livro livro3 = new Livro("Nada aqui", "Joao Pimenta", 2013,true);
        Livro livro4 = new Livro("O controle da raiva", "Moises Nascimento", 2017,true);
        Livro livro5 = new Livro("Afraid", "Eminem", 2022,true);

        BibliotecaPublica.adicionarLivro(livro1);
        BibliotecaPublica.adicionarLivro(livro2);
        BibliotecaPublica.adicionarLivro(livro3);
        BibliotecaPublica.adicionarLivro(livro4);
        BibliotecaPublica.adicionarLivro(livro5);


        Usuario u1 = new Usuario("Joao Pedro", "1290381092");

        BibliotecaPublica.livrosDisponiveis();
        System.out.println("------------------------------------------------------");


        BibliotecaPublica.emprestarLivro(livro1, u1);
        BibliotecaPublica.emprestarLivro(livro2, u1);
        BibliotecaPublica.emprestarLivro(livro3, u1);

        System.out.println("------------------------------------------------------");

        BibliotecaPublica.livrosDisponiveis();
        System.out.println("------------------------------------------------------");
        BibliotecaPublica.devolverLivro(livro1,u1);
        BibliotecaPublica.devolverLivro(livro2,u1);
        BibliotecaPublica.devolverLivro(livro3,u1);

    }

}
