package ReservaViagem;

import java.util.List;
import java.util.ArrayList;

public class Reserva {

    public static void main(String[] args) {

        List<Transporte> reservas = new ArrayList<>();

        reservas.add(new Aviao("SALVADOR", "BRASILIA", 300.00,true));
        reservas.add(new Aviao("RIO DE JANEIRO", "SÃO PAULO", 320.00,false));
        reservas.add(new Aviao("RECIFE", "GOIANIA", 130.00,true));
        reservas.add(new Onibus("MARANHÃO", "GOIANIA", 230.00,false));
        reservas.add(new Onibus("FORTALEZA", "PIAUI", 120.00,true));


        System.out.println("🔎 Reservas de Viagem:");
        for(Transporte x : reservas){
            System.out.println(x);
            System.out.println("=====================================================================================");
        }








    }

}
