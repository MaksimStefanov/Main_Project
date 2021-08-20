package stefanovmaxim;
/* 5. Конец учебного курса в Hillel по QA Automation, судьбоносный момент школьной успеваемости.
 * Средние баллы должны быть рассчитаны. Все студенты пишут преподавателю и просят  посчитать для них их средний балл.
 * Необходимо вернуть среднее значение массива, округленное до ближайшего целого числа.
 * реализовать через forEach
 */


import java.util.Arrays;

public class Qqqqqq {
   /* public static void main(String[] args) {
       int[] marks = {100,40,50,61};
        System.out.println(getAverage(marks));
    }

    public static int getAverage(int[] marks) {
        int summ = 0;
        for (int temp : marks) {
            summ += temp;

        }
return summ/marks.length;

    }
}*/


//12. Напишите программу, которая проверяет, является ли строка (используйте массив символов) палиндромом
/*
public static void main(String[] args) {
   char[] arr = {'с','л','о','в','о'};
    char[] arr1 = {'д','о','х','о','д'};
    isPalindrome(arr);
    isPalindrome(arr1);
}
    public static void isPalindrome(char[] arr) {

        char[] tempArr = new char[arr.length];

        for (int i = tempArr.length - 1, j = 0; i >= 0; i--, j++) {
            tempArr[j] = arr[i];
        }
        System.out.println("char" + Arrays.toString(arr));
        if (Arrays.equals(arr, tempArr)) {
            System.out.println("Это палиндромом ");
        } else {
            System.out.println("Это не палиндромом");
        }
    }
}
*/
/*//9. Подсчитать слова в тексте

    public static void main(String[] args) {

        System.out.println(countWordsUsingSplit("Подсчитать слова в тексте"));
    }
    public static int countWordsUsingSplit(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }*/

    //10. Подсчитать количество слов одинаковой длины в тексте.

    public static void CountWordsLength(String s) {

        int[] res = new int[15];
        String[] words = s.split("\\s+");
        for (String word : words) {
            int abc = word.length();
            res[abc] = res[abc] + 1;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                System.out.println("Length " + i + "  Quantity " + res[i]);
            }

        }
    }

    public static void main(String[] args) {
        CountWordsLength("If you want to filter a reference get an array of the original type as the result:");
    }


}














