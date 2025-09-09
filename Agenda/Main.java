package Agenda;

public class Main {
    public static void main(String[] args) {
        AgendaTelefone agenda = new AgendaTelefone();

        agenda.adicionarContato("Pedro", "71993251141");
        agenda.adicionarContato("Pedro", "71993255453");
        agenda.adicionarContato("Pedro", "71993255453");
        agenda.adicionarContato("Pedro", "71993255453");
        agenda.adicionarContato("Pedro", "71993255493");
        agenda.adicionarContato("Pedro", "71993255473");
        agenda.adicionarContato("Pedro", "71993255463");
        agenda.adicionarContato("Pedro", "71993255443");
        agenda.adicionarContato("Pedro", "71993255433");
        agenda.listarContato();
    }

}
