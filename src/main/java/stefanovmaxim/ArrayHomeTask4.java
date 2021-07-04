package stefanovmaxim;
/*4) Создать массив целых чисел. Отсортировать массив по
убыванию(не использовать метод Arrays.sort()).
Вывести массив до сортировки и после сортировки.
Массив после сортировки вывести тремя способами:
а) с помощью цикла for
b) с помощью цикла foreach
c) с помощью метода из класса Arrays*/

import java.util.Arrays;

public class ArrayHomeTask4 {

    public static void main(String[] args) {
        int n = 0;
        int[] array2 = {4, 5, 6, 7, 8, -9, 1, 3};
        for (int b = 0; b < array2.length; b++) {
            System.out.print(array2[b] + " ");
        }
        System.out.println();
        for (int j = 0; j < array2.length - 1; j++) {
            for (int i = 0; i < array2.length - 1 - n; i++) {
                if (array2[i] < array2[i + 1]) {
                    int s = array2[i + 1];
                    array2[i + 1] = array2[i];
                    array2[i] = s;
                }
            }
        }
        n++;

        // а) с помощью цикла for
        /*for (int a = 0; a < array2.length - 1; a++) {
            System.out.print(array2[a] + " ");}*/

        // b) с помощью цикла foreach
        /*for (int foreach : array2) {
            System.out.print(foreach+" ");}*/

        // c) с помощью метода из класса Arrays
        System.out.println(Arrays.toString(array2));

    }
}


