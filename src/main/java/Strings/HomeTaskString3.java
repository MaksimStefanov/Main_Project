package Strings;

import java.io.IOException;

public class HomeTaskString3 {
    public static int changeString(String str) throws IOException {
        String[] massStr = str.split(" ");
        int result = 0;
        int x = Integer.parseInt(massStr[0]);
        int x1 = Integer.parseInt(massStr[2]);
        if ("plus".equals(massStr[1])) {
            result = x + x1;
        }
        if ("minus".equals(massStr[1])) {
            result = x - x1;
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";
        System.out.println(s1+" = "+changeString(s1));
        System.out.println(s2+" = "+changeString(s2));
        System.out.println(s3+" = "+changeString(s3));
        System.out.println(s4+" = "+changeString(s4));
    }

}
