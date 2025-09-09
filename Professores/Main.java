package Professores;

public class Main {

    public static void main(String[] args) {
        String [] d1 = {"matematica","Banco de Dados", "ingles"};
        Professores p1 = new Professores("Silvio", d1);

        p1.exibirInfoProfessor();
    }

}
