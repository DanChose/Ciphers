package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vigenere {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine().toUpperCase().replaceAll("\\p{Space}","").replaceAll("[.!?\\\\-]","");
        String keyword = input.nextLine();

        List<String> phraseList = new ArrayList<String>(Arrays.asList(phrase.split("")));
        List<String> alphabet = new ArrayList<String>(Arrays.asList("абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toUpperCase().split("")));
        List<String> splitKeyword = new ArrayList<String>(Arrays.asList(keyword.split("")));
        List<String> keywordList = new ArrayList<String>();

        int k = 0;
        for (int i = 0; i < phrase.length(); i++){
            if (i % splitKeyword.size() == 0){
                k = 0;
            }
            keywordList.add(i, splitKeyword.get(k));
            k++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phraseList.size(); i++){
            result.append(alphabet.get((alphabet.indexOf(phraseList.get(i)) + alphabet.indexOf((keywordList.get(i)))) % 33));
        }
        System.out.print(result);
        input.close();
    }
}
