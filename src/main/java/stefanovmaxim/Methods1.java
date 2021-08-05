package stefanovmaxim;

import java.io.IOException;
/*
1)метод имеет параметры?
- да, int a, int b
2) метод имеет возвращаемое значение?
- нет
*/
public class Methods1 {
    public static void main(String[] args) throws IOException {
        Methods1.div(10, 2);
    }

    public static void div(int a, int b) {
        int x ;
        if (b != 0) {
            x = a / b;
            System.out.println(x);
        } else {
            System.out.println("На 0 делить нельзя!");

        }

    }

}

