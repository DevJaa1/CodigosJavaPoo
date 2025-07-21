package Escola;

public class Alunos implements Pessoa{

   private String nome;
   private String matricula;
   private String curso;

    public Alunos (String nome, String matricula, String curso) {
        this.curso = curso;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override

    public void exibirDados() {
        System.out.println("NOME DO ALUNO: " + this.nome);
        System.out.println("NUMERO DA MATRICULA: " + this.matricula);
        System.out.println("CURSO EM ANDAMENTO: " + this.curso);
    }
}
