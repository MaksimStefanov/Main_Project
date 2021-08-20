package Strings;

import java.util.Arrays;

public class Task5StringTask4 {
    public static void main(String[] args) {
        /*Упорядочить и вывести строки в порядке возрастания значений их длины.*/
        String[] mas3 = {"Dog", "Apple", "Cat", "Hamster"};//{3,4,3,7}
        //"Dog, "Cat", "Apple", "Hamster"

        //We can't use Array.sort(mas3) because array of Strings is sorted in alphabet order.
        //So in our case we can't use
        //Arrays.sort(mas3);
        //System.out.println(Arrays.toString(mas3));

        for (int j = 0; j < mas3.length; j++) {
            for (int i = 0; i < mas3.length-1; i++) {
                if (mas3[i].length() > mas3[i + 1].length()) {
                    String temp = mas3[i + 1];
                    mas3[i + 1] = mas3[i];
                    mas3[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(mas3));

    }
}
