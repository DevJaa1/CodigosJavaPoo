package Kata;

public class InverterVetor {

    public int [] inverternumeros (int [] a, int [] b) {
        
        int [] soma = new int[a.length];
        int carry = 0;
        
        for(int i = 0; i < a.length / 2 ; i++){
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        for(int i = 0; i < b.length / 2; i++){
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }

        
        return soma;

    }

    public static void main(String[] args) {
        
        int [] l1 = {2,4,3};
        int [] l2 = {5,6,4};

        InverterVetor obj = new InverterVetor(); 
        int [] res = obj.inverternumeros(l1,l2);

        for (int n : l1) {
            System.out.print(n + " | ");
        }
        System.out.println();

        for (int n : l2) {
            System.out.print(n + " | ");
        }

        System.out.println();
        for(int x : res){
            System.out.print(x + " | ");
        }




    }


}

