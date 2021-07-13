package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTaskString2 {
    public static void first() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type first word, quantity of chars should be even :");
        String text = reader.readLine();
        System.out.println("type second word, quantity of chars should be even :");
        String text1 = reader.readLine();

        int halfLength = text.length() / 2;
        for (int i = 0; i < halfLength; i++) {
            System.out.print(text.charAt(i));
        }
        int halfLength1 = text1.length() / 2;
        for (int i = halfLength; i < text1.length(); i++) {
            System.out.print(text1.charAt(i));
        }
    }

    public static void main(String[] args) throws IOException {
        first();
    }
}

