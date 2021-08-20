package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3) Найти минимальный элемент в массиве целых чисел.
Длину массива и числа ввести с консоли.
В результате вывести в консоль:
“Минимальное число: 5”*/
public class ArrayHomeTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type lenght of massive : ");
        String size = reader.readLine();
        int a = Integer.parseInt(size);
        int[] array2 = new int[a];
        for (a = 0; a <= array2.length - 1; a++) {
            System.out.println("type " + (a+1) + " element of massive : ");
            String number = reader.readLine();
            int b = Integer.parseInt(number);
            array2[a] = b;
        }

        for (int j = 0; j < array2.length - 1; j++) {
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] < array2[i + 1]) {
                    int s = array2[i + 1];
                    array2[i + 1] = array2[i];
                    array2[i] = s;

                }

            }
        }
        System.out.println("Minimum number : " + array2[array2.length - 1]);
    }

}




