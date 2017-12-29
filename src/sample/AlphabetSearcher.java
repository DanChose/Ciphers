package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class AlphabetSearcher {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt() - 1;
        List alphabetSearcher = Arrays.asList(new Character[] {'а','ә','б','в','г','ғ','д','е','ё','ж','з','и','й','к','қ','л','м','н','ң','о','ө','п','р','с','т','у','ұ','ү','ф','х','һ','ц','ч','ш','щ','ъ','ы','і','ь','э','ю','я'});
        char[] alphabet = {'а','ә','б','в','г','ғ','д','е','ё','ж','з','и','й','к','қ','л','м','н','ң','о','ө','п','р','с','т','у','ұ','ү','ф','х','һ','ц','ч','ш','щ','ъ','ы','і','ь','э','ю','я'};
        char aha = alphabet[position];
        System.out.println(aha);
    }
}
