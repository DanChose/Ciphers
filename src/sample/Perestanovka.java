package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Perestanovka {
    public static void main(String[] args) {
        Scanner hey = new Scanner(System.in);
        System.out.print("Исходная фраза: ");
        String phrase = hey.nextLine();
        System.out.println("\nЗашифрованная фраза: " + shuffle(phrase));

        }




    public static String shuffle(String result) {
        result = result.toLowerCase();
        String[] ary = result.split("");
        String[] ory = result.split("");
        List<String> list = Arrays.asList(ary);
        List<String> list1 = Arrays.asList(ory);
        Collections.shuffle(list);
        int keyShuffle = list.indexOf(ary[0]);
        int index = 0;
        String p = "";
        for (int i = 0; i < result.length(); i++) {
            index = list.indexOf(ory[i]);
            p += String.valueOf(index+1);
        }
        String hi = p;
        System.out.println("key: " + hi);
        result = "";
        for (String alpha : list) {
            result += alpha;
        }
        return result;
    }



}


