package Kata;
import java.util.ArrayList;


public class removerPares {

    public static void main (String[]args){

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 11; i++){
            numeros.add(i);
        }

        numeros.removeIf(n -> n % 2 == 0);

        System.out.print(numeros);
    }


}
