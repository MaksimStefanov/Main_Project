package stefanovmaxim;

public class HomeTask14 {
    public static void main(String[] args) {
        int y = 1;
        String A = "A";
        String B = "A";
        while (true) {
            if (y < 6) {
                System.out.print(A);
                y++;
                A = A + B;
            } else {
                break;


            }
            System.out.println();
        }
    }
}