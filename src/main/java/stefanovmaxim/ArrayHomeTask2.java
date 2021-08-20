package stefanovmaxim;
/*2) Создать массив целых чисел.
В созданном массиве найти:
а) среднее арифметическое
b) сумму всех элементов
с) количество элементов между максимальным и
минимальным элементом.
Вывести результаты в виде:
“Среднее арифметическое”:5.5
“Сумма всех элементов”: 345
“Количество элементов между максимальным и минимальным
элементом”: 5
*/

import java.util.Arrays;

public class ArrayHomeTask2 {
    public static void main(String[] args) {

        // b) сумму всех элементов
        int[] array = {4, 5, 6, 7, 8, -9, 1, 3};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов: " + sum);


        //а) среднее арифметическое
        int[] array1 = {4, 5, 6, 7, 8, -9, 1, 3};
        int summ = 0;
        for (int i = 0; i < array1.length; i++) {
            summ = summ + array[i];
        }
        double middle = (double) summ / array1.length;
        System.out.println("Среднее арифметическое: " + middle);


        //с) количество элементов между максимальным и
        //минимальным элементом.
        int[] arraydiff = {4, 5, 6, 7, 8, -9, 1, 3};
        Arrays.sort(arraydiff);
        System.out.println("Количество элементов между максимальным и минимальным\n" +
                "элементом: " + (arraydiff.length - 2));
    }

}

