package stefanovmaxim;

import java.beans.PropertyEditorSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Tassksort {
        /*public static void main(String[] args) {
            System.out.println(reverseName("Оля"));
        }

        // 3 вернуть перевернутое имя Оля -> Яло, первая буква должна быть большая, а та которая была первой маленькая без reverce
        public static String reverseName(String str) {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                if (i == str.length() - 1) {
                    result = result + Character.toUpperCase(ch);
                    continue;
                }
                if (i == 0) {
                    result = result + Character.toLowerCase(ch);
                    continue;
                }
                result = result + ch;
            }

            return result;

        }

    }*/

    /* public static void main(String[] args) throws IOException {

         System.out.println(reverseLine());
     }


     public static String reverseLine() throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s = reader.readLine();
         return new StringBuilder(s).reverse().toString();
     }
 }*/

    /*public static void main(String[] args) throws IOException {
        System.out.println(reverce());
    }

    public static String reverce() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String space = "";
        for (int i = 0; i < str.length(); i++) {
            space = str.charAt(i) + space;
        }
        return space;
    }
}*/


    /*
    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    };
*/
//
//    public static String reverseString(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            result = str.charAt(i) + result;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverseString("собака" ));
//    }
//}


    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("Алабай"));
    }
}