package Kata;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero: ");

        int num = sc.nextInt();
        int ac = 0;

        for (int i = 0; i < num+1; i++){
            ac+=i;
            System.out.print(ac + " | ");
        }
    }
}
