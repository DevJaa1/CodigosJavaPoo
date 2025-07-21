package Kata;

import java.util.Scanner;

public class ScrabbleScore {

    public static int Calculator(String palavra) {
        palavra = palavra.toUpperCase(); // deixa as letras minusculas em maiusculas

        int pontos = 0;

        for (int i = 0; i < palavra.length(); i++) { // faz um loop de acordo com a quantidade de letras da palavra digitada
            char letra = palavra.charAt(i); // a cada vez a variavel letra se torna uma das letras da palavra digitada para verificar se a letra se encontra dentro dos padrões

            switch (letra) {

                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'R':
                case 'S':
                case 'T':
                    pontos += 1;
                    break;

                case 'D':
                case 'G':
                    pontos += 2;
                    break;

                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    pontos += 3;
                    break;

                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    pontos += 4;
                    break;

                case 'K':
                    pontos += 5;
                    break;

                case 'J':
                case 'X':
                    pontos += 8;
                    break;

                case 'Q':
                case 'Z':
                    pontos += 10;
                    break;

            }


        }

        return pontos;

    }

    public static void main(String[] args) {

        Scanner ls = new Scanner(System.in);
        System.out.print("Informe a palavra: ");
        String text = ls.nextLine();

        int valor = Calculator(text);

        System.out.print("O valor Scrabble: ");
        System.out.print(valor);

    }

}
