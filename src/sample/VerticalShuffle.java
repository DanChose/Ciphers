package sample;

import java.util.*;


public class VerticalShuffle {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        String text = hello.nextLine();
        String phrase = text.toUpperCase();
        phrase = phrase.replaceAll("\\p{Space}", "");
        int lengthOfPhrase = phrase.length();
        List<Integer> dataList = new ArrayList<Integer>();
        /*Далее идут два условия, которые нужны для двух случаев:
        1) длина введенной фразы меньше 6 символов
        2) длина введенной фразы больше 6 символов
        В первом случае в список добавляется 3 цифры, которые в дальнейшем будут перемешаны.
        Во втором случае в список добавляются 6 цифр, которые также будут перемешаны.
        * */
        if (lengthOfPhrase < 6) {
            for (int i = 0; i < 3; i++) {
                dataList.add(i);
            }
        } else {
            for (int i = 0; i < 6; i++) {
                dataList.add(i);
            }
        }
        /*Созданный список цифр перемешивается. Создается массив из натуральных чисел,
        по размеру равный длине списка.
        * */
        Collections.shuffle(dataList);
        int[] num = new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            num[i] = dataList.get(i);
        }


        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.print("\n");
        /*Создал два списка, в одном разделенный по буквам введенный текст без пробелов.
        Во втором - на данный момент пустота. Но циклы ниже призваны это исправить.
        * */

        List<String> listOfSymbols = new ArrayList<String>(Arrays.asList(phrase.split("")));
        List<String> targetList = new ArrayList<String>(100);
        /*Данный случай создан для введенных фраз, длина которых не превышает 6 символов.
        Создается цикл, который повторяется столько раз, сколько символов в фразе. Внутри цикла
        идет добавление элементов введенной фразы в пустой список targetList.
        Второй цикл нужен для дополнения списка targetList до 9 символов.
        Второй цикл повторяется столько раз, сколько не достает введенной фразе без пробелов до 9 символов.
        * */
        if (listOfSymbols.size() <= 6) {
            for (int i = 0; i < listOfSymbols.size(); i++) {
                targetList.add(i, listOfSymbols.get(i));
            }
            int indexOfNull = targetList.size();
            for (int i = indexOfNull; i < 9; i++) {
                targetList.add(i, "-");
            }
        }
        /*Следующие строки диктуют поведение в случае длины фразы более 6 символов.
        Создается цикл, в который заносятся все символы фразы, кроме пробелов.
        Далее находится ближайшее кратное трем число и лист дозаполняется до этого числа с помощью тире.
        * */
        if (lengthOfPhrase > 6) {
            for (int i = 0; i < listOfSymbols.size(); i++) {
                if (listOfSymbols.get(i) != null) {
                    targetList.add(i, listOfSymbols.get(i));
                }
            }
            int closestSixDivider = 0;
            if (listOfSymbols.size() % 6 == 0) {
                closestSixDivider = listOfSymbols.size();
            } else {
                for (int i = 0; i < 6; i++) {
                    if ((listOfSymbols.size() + i) % 6 == 0) {
                        closestSixDivider = listOfSymbols.size() + i;
                    }
                }

            }
            for (int i = listOfSymbols.size(); i < closestSixDivider; i++) {
                targetList.add(i, "-");
            }
        }
        String p = "";
        int k = 0;
        List<String> resultingList = new ArrayList<String>();
        for (int i = 0; i < num.length; i++) {
            k = dataList.indexOf(i);
            for (int j = k; j < targetList.size(); j +=  num.length) {
                resultingList.add(i, targetList.get(j));
                p += resultingList.get(i);
            }
            //  targetList.get(i + num.length);
        }
        System.out.println("\n" + p);

    }
}
