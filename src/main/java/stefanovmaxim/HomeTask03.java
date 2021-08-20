package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ReadOnlyBufferException;

public class HomeTask03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type number:");
        String number = reader.readLine();
        int x = Integer.parseInt(number);
        String z = "Your input number: ";
        String y = "Your number after changes: ";
        if (x >= 1) {
            System.out.println(z + x);
            System.out.println(y + (x * 2));

        } else if (x < 0) {
            System.out.println(z + x);
            System.out.println(y + (x + 1));
        } else {
            System.out.println(z + 0);
        }

        System.out.println("DONE");

    }
}