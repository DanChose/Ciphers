package sample;

import java.util.Random;
import java.util.Scanner;


public class Transposition {
    public static void main(String[] args) {
        /*Scanner hey = new Scanner(System.in);
        System.out.print("Исходная фраза: ");
        String phrase = hey.nextLine();*/
        int[] yo = {1,2,3,4,4,5,5,5,5,6};
        shuffleArray(yo);
        System.out.println(String.valueOf(yo));
    }
    private static void shuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
