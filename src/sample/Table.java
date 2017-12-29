package sample;


import java.util.*;

/**
 * Created by Мирас on 02.02.2017.
 */
public class Table {
    public static void main(String[] args) {

        Scanner dayum = new Scanner(System.in);
        System.out.print("Введите фразу: ");
        String phrase = dayum.nextLine();
        arrays(phrase);


    }

    public static void arrays(String phrase) {
        phrase = phrase.toUpperCase(); //Введенную фразу в верхний реестр и присваиваем это значение переменной phrase
        phrase = phrase.replaceAll("\\p{Space}", "");
        List<String> textList = new ArrayList<String>();
        char[] m1 = phrase.toCharArray(); // Создаем массив m1 и присваиваем ему значение введенной фразы, преобразованной в массив символов
        char[][] m2 = {{'a', 'b', 'c', 'd', 'e'}, {'f', 'g', 'h', 'i', 'k'}, {'l', 'm', 'n', 'o', 'p'}, {'q', 'r', 's', 't', 'u'}, {'v', 'w', 'x', 'y', 'z'}};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.print("Код фразы: ");
        //repeatCheck(m1);
        arraysFill(m1, m2);
        // alphabetInteraction(alphabet, m1, m2);
    }


    /*public static void repeatCheck(char m1[]){
        int k = 0;
        if (m1[k] == m1[1-m1.length]) {
            *//*for(int i = 0; i < m1.length; i++){
                HashSet<Character> m = new HashSet<Character>(Arrays.asList(m1));
                char[] result = m.toArray(new Character[m.Size()]);
            }*//*
        }
    }*/
    public static void arraysFill(char m1[], char m2[][]) {
        int a = 5;
        int b = a;
        int c = 2 * a;
        int d = 3 * a;
        int e = 4 * a;
        if (m1.length <= a) {
            for (int i = 0; i < m1.length; i++) {
                m2[0][i] = m1[i];
                System.out.print(m2[0][i] + " ");
            }
        } else if (m1.length > a & m1.length <= 2 * a) {
            for (int i = 0; i < a; i++) {
                m2[0][i] = m1[i];
                System.out.print(m2[0][i] + " ");
            }
            for (int i = 0; i < m1.length - a; i++) {
                m2[1][i] = m1[b];
                System.out.print(m2[1][i] + " ");
                b++;
            }

        } else if (m1.length > 2 * a & m1.length <= 3 * a) {
            for (int i = 0; i < a; i++) {
                m2[0][i] = m1[i];
                System.out.print(m2[0][i] + " ");
            }
            for (int i = 0; i < a; i++) {
                m2[1][i] = m1[b];
                System.out.print(m2[1][i] + " ");
                b++;
            }
            for (int i = 0; i < m1.length - b; i++) {
                m2[2][i] = m1[c];
                System.out.print(m2[2][i] + " ");
                c++;
            }
        } else if (m1.length > 3 * a & m1.length <= 4 * a) {
            for (int i = 0; i < a; i++) {
                m2[0][i] = m1[i];
                System.out.print(m2[0][i] + " ");
            }
            for (int i = 0; i < a; i++) {
                m2[1][i] = m1[b];
                System.out.print(m2[1][i] + " ");
                b++;
            }
            for (int i = 0; i < a; i++) {
                m2[2][i] = m1[c];
                System.out.print(m2[2][i] + " ");
                c++;
            }
            for (int i = 0; i < m1.length - c; i++) {
                m2[3][i] = m1[d];
                System.out.print(m2[3][i] + " ");
                d++;
            }
        } else if (m1.length > 4 * a & m1.length <= 5 * a) {
            for (int i = 0; i < a; i++) {
                m2[0][i] = m1[i];
                System.out.print(m2[0][i] + " ");
            }
            for (int i = 0; i < a; i++) {
                m2[1][i] = m1[b];
                System.out.print(m2[1][i] + " ");
                b++;
            }
            for (int i = 0; i < a; i++) {
                m2[2][i] = m1[c];
                System.out.print(m2[2][i] + " ");
                c++;
            }
            for (int i = 0; i < a; i++) {
                m2[3][i] = m1[d];
                System.out.print(m2[3][i] + " ");
                d++;
            }
            for (int i = 0; i < m1.length - d; i++) {
                m2[4][i] = m1[e];
                System.out.print(m2[4][i] + " ");
                e++;
            }

        }
    }

    public static void alphabetInteraction(char alphabet[], char m1[], char m2[][]) {
        for (int i = 0; i < 5; i++) {
            if (m2[0][i] == alphabet[i]) {

            }
        }
    }
}
