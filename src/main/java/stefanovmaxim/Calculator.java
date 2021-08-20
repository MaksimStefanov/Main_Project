package stefanovmaxim;

public class Calculator {

    public static void main(String[] args) {
        // a
        int a = -5;
        int b = 8;
        int c = 6;
        int x = a + b * c;
        // b
        System.out.println(x);
        int d = 55;
        int e = 9;
        int f = (d + e) % e;
        System.out.println(f);
        // c
        int ab = 20;
        double bc = -3;
        double cd = 5;
        double de = 8;
        double ae = ab + bc * cd / de;
        System.out.println(ae);
        // d
        int qw = 3;
        int we = 2;
        int ws = 15;
        int rg = 5;
        int t = 8;
        int rf = rg + ws / qw * we - t % qw;
        System.out.println(rf);


    }
}
