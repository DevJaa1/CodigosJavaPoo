package Kata;

public class Mamacos {
    

    public static int [] ContarMamaco (int x) {

        int mamacos [] = new int[x];

        for(int i = 0; i < mamacos.length; i++){
            mamacos[i] = i;
        }

        for (int j = 0; j < mamacos.length; j++){
            System.out.print("[" + (j + 1)+ "]");
        }

        return mamacos;
    }

    public static void main(String[]args){
        ContarMamaco(10);
    }

}
