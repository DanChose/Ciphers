package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Affine {
    public static void main(String[] args){
        String text = "Hello";
        List<String> originalPhraseList = new ArrayList<String>(Arrays.asList(text.split("")));
        Scanner firstNumber = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = firstNumber.nextInt();
        Scanner secondNumber = new Scanner(System.in);
        System.out.print("Введите b: ");
        int b = secondNumber.nextInt();
        int i = 0;
        while ((i*a)%26 != 1){
            i++;
        }
        System.out.println(i);
        char[] alphabet = {'A','B','C','D','E',
                'F','G','H','J','K',
                'L','M','N','O','P',
                'Q','R','S','T','U',
                'V','W','X','Y','Z'};
        List<String> alphabetList = new ArrayList<String>(Arrays.asList(alphabet.toString()));
        for (int j = 0; j < text.length(); j++){
            int m = alphabetList.indexOf(originalPhraseList.get(j));
            System.out.println(m);
        }
    }
}
