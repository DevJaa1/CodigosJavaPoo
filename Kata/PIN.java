package Kata;

public class PIN {

    public static boolean ValidatePin(String num) {
        return num.matches("\\d{4}") || num.matches("\\d{6}");
    }

    public static void main(String[]args) {

        System.out.println(ValidatePin("a234"));
        System.out.println(ValidatePin("12"));
        System.out.println(ValidatePin("1234"));
        System.out.println(ValidatePin("12345"));
        System.out.println(ValidatePin("1234567"));
        System.out.println(ValidatePin("-1234"));

    }

}