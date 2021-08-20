package Strings;

import java.util.Arrays;

public class Task5StringTask5 {
    public static void main(String[] args) {
        /*Даны строки разной длины (длина - четное число),
        необходимо вернуть ее два средних знака:
         "arrayO" → "ra", "code" → "od", "Practice"→"ct".
        */
        String s5 = "arrayO";
        String s6 = "code";
        String s7 = "Practice";

        Task5StringTask5.printMiddleLetters(s5);
        Task5StringTask5.printMiddleLetters(s6);
        Task5StringTask5.printMiddleLetters(s7);
    }

    public static void printMiddleLetters(String s){
        int firstLetter = s.length()/2; //3
        System.out.println(""+s.charAt(firstLetter-1)+s.charAt(firstLetter));
    }

}
