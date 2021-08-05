package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods6 {
    //    6) Ввести 5 целых чисел с консоли
//    Подсчитать минимум из 5 целых чисел.
//    Напечатать результат в консоль
//    Подсказка:
//    нужно переиспользовать метод по нахождению минимума между 2мя
//    числами.
    public static int minValue() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please type 1 number: ");
        int first = Integer.parseInt(reader.readLine());
        System.out.println("Please type 2 number: ");
        int second = Integer.parseInt(reader.readLine());
        System.out.println("Please type 3 number: ");
        int third = Integer.parseInt(reader.readLine());
        System.out.println("Please type 4 number: ");
        int forth = Integer.parseInt(reader.readLine());
        System.out.println("Please type 5 number: ");
        int fifth = Integer.parseInt(reader.readLine());
        int firstCompare = Math.min(first, second);
        int secondCompare = Math.min(third, forth);
        int lower = fifth;
        if (lower > firstCompare) {
            lower = firstCompare;
        }
        if (lower > secondCompare) {
            lower = secondCompare;
        }
        return lower;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("The lowest number is " + minValue());
    }

}

