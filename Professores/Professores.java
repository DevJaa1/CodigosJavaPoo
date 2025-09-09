package Professores;

public class Professores {

    private String nomeProfessor;
    private String[] disciplinasEnsinadas;


    public Professores(String nome, String [] disciplina){
        this.nomeProfessor = nome;
        
        if(disciplina.length < 3){
            for(int  i = 0; i < disciplina.length; i++){
                disciplinasEnsinadas[i] = disciplina[i]; 
            }
        }else{
            this.disciplinasEnsinadas = disciplina;
        }
    }

    public void exibirInfoProfessor () {
        System.out.println("Nome do Professor: " + nomeProfessor);
        System.out.print("Disciplinas ensinadas: ");
        for(int i = 0; i < disciplinasEnsinadas.length; i++){
            System.out.print(disciplinasEnsinadas[i] + " | ");
        }
        System.out.println();
    }


}
