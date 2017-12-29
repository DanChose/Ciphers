package sample;

import java.util.*;


public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encryptedMessage = scan.nextLine();
        encryptedMessage = encryptedMessage.replaceAll("\\p{Space}","").toUpperCase();
        decryption(encryptedMessage);

    }

    public static String decryption(String text) {
        char[] textToArray = text.toCharArray();
        char[] sortedByFrequency = new char[textToArray.length];
        List<String> listOriginalPhrase = new ArrayList<String>(Arrays.asList(text.split("")));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listOriginalPhrase.size(); i++) {
            int numberOfTimes = Collections.frequency(listOriginalPhrase, listOriginalPhrase.get(i));
            //System.out.print(numberOfTimes + listOriginalPhrase.get(i) + " ");
            sb.append(numberOfTimes + listOriginalPhrase.get(i));
        }
        String result = sb.toString();
        int k = Integer.parseInt(result.replaceAll("[\\D]", ""));
        System.out.println(Math.max(k,k));
        /*alphabetSearcher(textToArray,text);
        frequencySearcher(textToArray,text);*/
        return result;
    }

    public static void countOccurences() {

    }

    /*public static void alphabetSearcher(){
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt() - 1;
        char[] alphabet = {'а','ә','б','в','г','ғ','д','е','ё','ж','з','и','й','к','қ','л','м','н','ң','о','ө','п','р','с','т','у','ұ','ү','ф','х','һ','ц','ч','ш','щ','ъ','ы','і','ь','э','ю','я'};
        char gotYou = alphabet[position];
        System.out.println(gotYou);
    }
    public static void frequencySearcher(char[] textToArray,String text){
        List frequencySearcher = Arrays.asList(new Character[] {'а','е','ы','н','і','т','р','л','д','с','қ','к','б','п','о','й','м','ж','ғ','ң','ң','з','ш','ү','г','у','ұ','ө','ә','и','я','в','х','ф','ь','ч','ю','ц','һ','щ','ъ','э','ё'});
        int indexFrequency = 0;
        for (int i = 0; i < text.length(); i++) {
            indexFrequency = frequencySearcher.indexOf(textToArray[i]);
        }
    }
    public static void alphabetSearcher(char[] textToArray,String text){
        List alphabetSearcher = Arrays.asList(new Character[] {'а','ә','б','в','г','ғ','д','е','ё','ж','з','и','й','к','қ','л','м','н','ң','о','ө','п','р','с','т','у','ұ','ү','ф','х','һ','ц','ч','ш','щ','ъ','ы','і','ь','э','ю','я'});
        int indexAlphabet = 0;
        for (int i = 0; i < text.length(); i++) {
            indexAlphabet = alphabetSearcher.indexOf(textToArray[i]) + 1;
            System.out.print(textToArray[i] + "-" + indexAlphabet + " ");
        }
    }*/
}
