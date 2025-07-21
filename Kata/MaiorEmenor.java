package Kata;

public class MaiorEmenor {
    public static void main(String[] args) {
        
        int [] vet = {3,544,5,545,4,5,342,231};

        int numMaior = vet[0];
        int numMenor = vet[0];

        for (int i = 1; i <vet.length; i++){
            if(vet[i] > numMaior) {
                numMaior = vet[i];
            }
        
            if(vet[i] < numMenor) {
                numMenor = vet[i];
            }
    }
        System.out.println("O maior numero é: " + numMaior);
        System.out.println("O Menor numero é: " + numMenor);

}
}