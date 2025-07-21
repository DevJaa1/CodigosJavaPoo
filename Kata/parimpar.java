package Kata;

import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int n = sc.nextInt();

        String res = (n%2 == 0) ? "Par" : "Impar";
        System.out.println(res);

    

    }

}
