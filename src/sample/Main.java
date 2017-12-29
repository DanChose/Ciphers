package sample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Исходная фраза: ");
        String phrase;
        phrase = sc.nextLine();
        Scanner dayum = new Scanner(System.in);
        int transpositionValue = dayum.nextInt();
        System.out.print("Введите сдвиг: ");
        System.out.print("Зашифрованная фраза: ");
        System.out.println(caesar(phrase, transpositionValue));

    }


    public static String caesar(String phrase, int transpositionValue) {
        //int transposition = 3;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        phrase = phrase.toLowerCase();
        for (int i = 0; i < phrase.length(); i++) {
            char k = phrase.charAt(i);
            if (k >= alphabet[transpositionValue] && k <= 'z') {
                //k  = java.util.Arrays.asList(alphabet).indexOf(k) -= transpositionValue;

                //java.util.Arrays.asList(theArray).indexOf('o');
            }



        }
        return phrase;
    }
}


