package stefanovmaxim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/*public class HomeTask12 {
    public static void main(String[] args) throws IOException {
        String rectangular = "8";
        int expectedLength = 4;
        int expectedHeight = 2;

        for (int height = 0; height < expectedHeight; height++) {
            for (int length = 0; length < expectedLength; length++) {
                System.out.print(rectangular);
            }
            System.out.println();

        }
    }
}*/

public class HomeTask12 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please type height: ");
        int expectedHeight = Integer.parseInt(reader.readLine());
        System.out.println("Please type length: ");
        int expectedLength = Integer.parseInt(reader.readLine());
        String rectangular = "8";
        for (int height = 0; height < expectedHeight; height++) {
            for (int length = 0; length < expectedLength; length++) {
                System.out.print(rectangular);
            }
            System.out.println();
        }
    }
}



