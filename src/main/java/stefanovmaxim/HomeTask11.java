package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please type your number: ");

        int count = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            count = count + number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(count);
    }
}

