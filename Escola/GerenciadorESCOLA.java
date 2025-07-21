package Escola;

public class GerenciadorESCOLA {

    public static void main(String[] args) {

        Alunos a1 = new Alunos("JOAO", "3002", "ENG SOFT");
        Professor p1 = new Professor("MARCO", "ARQ", 2000);

        a1.exibirDados();
        p1.exibirDados();
    }

}
