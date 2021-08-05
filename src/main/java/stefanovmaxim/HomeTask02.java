package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give month :");
        String season = reader.readLine();
        int x = Integer.parseInt(season);
        String y = "Your season is ";
        if (x >= 3 && x <= 5) {
            System.out.println("spring");
        } else if (x == 12 || x >= 1 && x <= 2) {
            System.out.println(y + "winter");
        } else if (x >= 6 && x <= 8) {
            System.out.println(y + "summer");
        } else if (x >= 9 && x <= 11) {
            System.out.println(y + "autumn");
        } else {
            System.out.println("Please provide number of month from 1 to 12");
        }
    }
}
