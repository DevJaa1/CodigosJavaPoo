package Kata;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int n = sc.nextInt();
        boolean primo = true;


        for(int i = 2; i < n; i++){
          if(n % i == 0) {
            primo = false;
            break;
          }

        }
        if(primo) {
            System.out.print(n + " É primo");
        } else {
            System.out.print("Não é primo");
        }





    }
}
