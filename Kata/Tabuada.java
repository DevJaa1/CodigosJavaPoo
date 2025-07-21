package Kata;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int mt = n*i;
            System.out.println(n + "x" + i  + " = " + mt);
        }



    }

}
