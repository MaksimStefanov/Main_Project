package selfControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Electricity: ");
        String electricity = reader.readLine();
        System.out.println("Gas: ");
        String gas = reader.readLine();
        System.out.println("Water(11126): ");
        String water11126 = reader.readLine();
        System.out.println("Water(100832): ");
        String water100832 = reader.readLine();
        int e = Integer.parseInt(electricity);
        int g = Integer.parseInt(gas);
        int w1 = Integer.parseInt(water11126);
        int w2 = Integer.parseInt(water100832);
        int sum = e + g + w1 + w2;
        System.out.println(sum);
    }
}

