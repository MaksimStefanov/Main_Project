package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type your number : ");
        String number = reader.readLine();
        double x = Integer.parseInt(number);
        double s = Math.sqrt(x);
        System.out.println("s = √x : " + s);
        s = Math.pow(s,x) + 4;
        System.out.println("s = s^x + 4 : " + s);

    }
}
