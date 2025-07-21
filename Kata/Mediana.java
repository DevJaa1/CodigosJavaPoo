package Kata;
import java.util.Arrays;


public class Mediana {
    public static double Median (int[]a, int[]b) {
        
       int [] comb = new int[a.length + b.length]; // aqui eu determinei o tamanho do novo vetor que vai receber os numeros dos dois vetorees parametros

       System.arraycopy(a,0,comb,0,a.length); // esse metodo faz com que eu consiga copiar os elementos do vetor "A" para outro vetor, no caso o "COMB"
       System.arraycopy(b,0,comb,a.length, b.length); // faz a mesma coisa de cima, mas ele continua a preencher o vetor comb a partir da posição que ele termina

       Arrays.sort(comb); // Põe em ordem o vetor em ordem crescente

       int n = comb.length; // guarda o tamanho do vetor, para verificar atraves do tamanho a posição dos elementros para verificar a mediana

       if(n % 2 == 0) { // verifica se é par 

        return (comb [n / 2 - 1] + comb [n / 2 ]) / 2.0; // Se for par, ele soma as duas posições centrais pegando a posição do N dividindo por 2 e subtraindo 1 para pegar a
                                                        // terceira posição e soma com o segundo numero central, pegando a posição do vetor, dividindo N de 2 para pegar o quarto elemento
       } else { // caso seja impar, ele pega o numero da posição central
        
        return comb [ n / 2]; // retorna o valor central caso impar
       }
        
    }

    public static void main(String[] args) {
        int [] a1 = {4,3,8};
        int [] a2 = {6,9,7,2};

        double mediana = Median(a1,a2);
        System.out.println(mediana);
    }

}
