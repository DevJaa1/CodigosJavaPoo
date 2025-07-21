package Escola;

public class Professor implements Pessoa {

    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario =  salario;
    }
    @Override

    public void exibirDados() {
        System.out.println("NOME DO PROFESSOR:  " + this.nome);
        System.out.println("SALÁRIO:  " + this.salario);
        System.out.println("DISCIPLINA:  " + this.disciplina);
    }

}
