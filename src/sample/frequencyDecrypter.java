package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class frequencyDecrypter {
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);

        String text = hey.nextLine();
        Set<String> set = new HashSet<String>(Arrays.asList(text));
        String[] result;
        for(int i = 0; i < text.length(); i++) {
            result = set.toArray(new String[set.size()]);
            for (String t: result){
                System.out.println(t);
            }
        }
    }
}
