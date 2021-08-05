package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask04Else {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your color: (options is red, orange, yellow, green, navy blue, blue, violet)");
        String color = reader.readLine();
        String y = "My favourite color is ";
        if (color.equals("red")) {
            System.out.println(y + "red");
        } else if (color.equals("orange")) {
            System.out.println(y + "orange");
        } else if (color.equals("yellow")) {
            System.out.println(y + "yellow");
        } else if (color.equals("green")) {
            System.out.println(y + "green");
        } else if (color.equals("navy blue")) {
            System.out.println(y + "navy blue");
        } else if (color.equals("blue")) {
            System.out.println(y + "blue");
        } else if (color.equals("violet")) {
            System.out.println(y + "violet");
        } else {
            System.out.println("Unfortunately I don't have favourite color");
        }
    }
}

