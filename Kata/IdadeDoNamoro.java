package Kata;

import java.util.Scanner;

public class IdadeDoNamoro {

    public static void Idade(int x) {

       if(x > 14) {
           int idadeMin = (x / 2) + 7;
           System.out.println("Idade minima: " + idadeMin);

           int idadeMax = 2 * (x - 7);
           System.out.println("Idade Máxima: " + idadeMax);

           System.out.print("Idade: " + x + " [ " + idadeMin + " - " + idadeMax + " ]");

       } else if (x <= 14) {

            double min = x - (0.10 * x);
            double max = x + (0.10 * x);

            int minInt = (int)min;
            int maxInt = (int)max;

            System.out.println("Idade minima: " + minInt);
            System.out.println("Idade máxima: " + maxInt);

        }
    }

    public static void main(String[] args) {

        Scanner ls = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int idade = ls.nextInt();


        Idade(idade);
    }

}
