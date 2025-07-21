package Kata;

public class inversorDeVetor {
    public static void main(String[] args) {
        
        int [] vet = {1,2,3,4,5,6,7};
        int [] cpvet = new int[vet.length];

        int f = vet.length - 1;

        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " | ");
        }

        System.out.println();

        for (int i = 0; i < vet.length; i++) {
            cpvet[i] = vet[f-i];
            System.out.print(cpvet[i] + " | ");
        }

    }

}
