package Alunos;

public class Alunos {

    private String nome;
    private int semestre;
    private int anoIngresso;

    public Alunos(String nome, int semestre, int anoIngresso) {
        this.anoIngresso = anoIngresso;
        this.nome = nome;
        this.semestre = semestre;
    }

    public void exibirInfo () {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Ano do Ingresso: " + anoIngresso);
        System.out.println("Semestre atual: " + semestre);

    }

}
