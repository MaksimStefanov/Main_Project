package Strings;

import java.util.Locale;

public class HomeTaskString5 {
    public static String print(String a) {
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String result = "";
        String[] splitString = a.split(" ");
        for (String value : splitString) {
            result = result + Character.toUpperCase(value.charAt(0))
                    + value.substring(1) + " ";
        }
        return result;


    }

    public static void main(String[] args) {

        System.out.println(print("It's the possibility of having a dream come true that makes life interesting."));
    }
}
