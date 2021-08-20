package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask04Switch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your color: (options is red, orange, yellow, green, navy blue, blue, violet)");
        String color = reader.readLine();
        String y = "My favourite color is ";
        String red, orange;
        switch (color) {
            case "red":
                System.out.println(y + "red");
                break;
            case "orange":
                System.out.println(y + "orange");
                break;
            case "yellow":
                System.out.println(y + "yellow");
                break;
            case "green":
                System.out.println(y + "green");
                break;
            case "navy blue":
                System.out.println(y + "navy blue");
                break;
            case "blue":
                System.out.println(y + "blue");
                break;
            case "violet":
                System.out.println(y + "violet");
                break;
            default:
                System.out.println("Unfortunately I don't have favourite color");
        }

    }
}


