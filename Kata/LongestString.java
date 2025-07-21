package Kata;

public class LongestString {
    
    public static int substring (String s){
        int max = 0; 

        for(int i = 0; i < s.length(); i++){
            String atual = "";

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if(atual.indexOf(c) != -1) {
                    break;
                } else {
                    atual += c;
                    max = Math.max(max, atual.length());
                }
            }
        }
        return max;

    }
    
    
    public static void main(String[] args) {

        System.out.println(substring("abcabcbb"));

    
    }

}
