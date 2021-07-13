package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTaskString4 {
    public static void main(String[] args) throws IOException {

        String[] name = new String[100];
        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите строкy" + i);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            name[i] = reader.readLine();

        }
        double average = 0;

        for (String a : name) {
            average = average + a.length();
        }
        average = name.length;

        System.out.println("Средняя длина строки : (" + average + ")");

        for (int i = 0; i < 10; i++) {
            if (name[i].length() < average) {
                System.out.println("Размер строки меньше средней: ");
            }
        }

    }


}
