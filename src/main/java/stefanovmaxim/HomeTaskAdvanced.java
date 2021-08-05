package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTaskAdvanced {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type 1st side");
        String side1 = reader.readLine();
        System.out.println("type 2nd side");
        String side2 = reader.readLine();
        System.out.println("type 3rd side");
        String side3 = reader.readLine();
        int a = Integer.parseInt(side1);
        int b = Integer.parseInt(side2);
        int c = Integer.parseInt(side3);
        int z = b + c;
        int x = a + c;
        int v = a + b;

        if (a < z && b < x && c < v) {
            System.out.println("Triangle exists");
        } else System.out.println("Triangle doesn't exist");
    }


}
