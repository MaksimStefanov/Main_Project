package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give points[0-100]:");
        String rating = reader.readLine();
        int rate = Integer.parseInt(rating);
        String x = "Grade: ";
        if (rate < 0) {
            System.out.println(x + "Impossible");
        } else if (rate >= 0 && rate <= 49)
            System.out.println(x + "Failed");
        else if (rate >= 50 && rate <= 59)
            System.out.println(x + "1");
        else if (rate >= 60 && rate <= 69)
            System.out.println(x + "2");
        else if (rate >= 70 && rate <= 79)
            System.out.println(x + "3");
        else if (rate >= 80 && rate <= 89)
            System.out.println(x + "4");
        else if (rate >= 90 && rate <= 100)
            System.out.println(x + "5");
        else System.out.println(x + "Incredible");
    }
}
