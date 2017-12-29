package sample;

import java.util.*;


public class Polibius {
    public static void main(String[] args){
        Scanner dayum = new Scanner(System.in);
        String phrase = dayum.nextLine();
        phrase = phrase.toUpperCase();
        phrase = phrase.replaceAll("\\p{Space}","");
        int lengthOfPhrase = phrase.length();
        char[][] alphabetArray = new char[][]
                {{'A','B','C','D','E'},
                 {'F','G','H','J','K'},
                 {'L','M','N','O','P'},
                 {'Q','R','S','T','U'},
                 {'V','W','X','Y','Z'}};
        List<String> listOfSymbols = new ArrayList<String>(Arrays.asList(phrase.split("")));
        char[] chars = phrase.toCharArray();
        char[] alphabet = {'A','B','C','D','E',
        'F','G','H','J','K',
        'L','M','N','O','P',
        'Q','R','S','T','U',
        'V','W','X','Y','Z'};
        Set<Character> phraseSet = new LinkedHashSet<Character>();
        for (char c: chars){
            phraseSet.add(c);
        }
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c: chars){
            charSet.add(c);
        }
        for (char c: alphabet){
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character: charSet){
            sb.append(character);
        }
        String result = sb.toString();
        List<String> resultingList = new ArrayList<String>(25);
        resultingList.addAll(Arrays.asList(result.split("")));
        System.out.println(resultingList);
        int index = 0;
        for (int i = 0; i < lengthOfPhrase; i++){
            index = resultingList.indexOf(listOfSymbols.get(i));
        }
        char[] forIndexes = result.toCharArray();
        int a = 5;
        int b = a;
        int c = 2*a;
        int d = 3*a;
        int e = 4*a;
        for (int i = 0; i < a; i++) {
            alphabetArray[0][i] = forIndexes[i];
            //System.out.print(alphabetArray[0][i] + " ");
        }
        for (int i = 0; i < a; i++) {
            alphabetArray[1][i] = forIndexes[b];
            //System.out.print(alphabetArray[1][i] + " ");
            b++;
        }
        for (int i = 0; i < a; i++){
            alphabetArray[2][i] = forIndexes[c];
            //System.out.print(alphabetArray[2][i] + " ");
            c++;
        }
        for (int i = 0; i < a; i++){
            alphabetArray[3][i] = forIndexes[d];
            //System.out.print(alphabetArray[3][i] + " ");
            d++;
        }
        for (int i = 0; i < phraseSet.size() - d; i++){
            alphabetArray[4][i] = forIndexes[e];
            //System.out.print(alphabetArray[4][i] + " ");
            e++;
        }
        if (phraseSet.size() <= 5){
            for (char c1 = 'A'; c1 < 'E'; c1++){
                System.out.print("A" + c1);
            }
        }
        else if(phraseSet.size() > 5 && phraseSet.size() <= 10){
            for (char c1 = 'A'; c1 < 'E'; c1++){
                System.out.print("A" + c1);
            }
            for (char c1 = 'A'; c1 < 'E'; c1++ ){
                System.out.print("B" + c1);
            }
        }
    }
}
