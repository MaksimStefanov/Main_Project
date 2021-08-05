package strings;

import java.util.Arrays;

public class Task5StringTask2 {
    public static void main(String[] args) {
        //Task1. Вывести строку без спама со ссылками «http://www.xyz51.com»
        String str = "Please visit http://www.xyz51.com my website";

        String[] array = str.split(" ");
//
//        1) 1st option
//        str.replace("http://www.xyz51.com", "");
        //2) 2nd option
        int firstLetterOfSubstring = str.indexOf("http://www.xyz51.com");
        int lengthOfSubstring = "http://www.xyz51.com".length();

        String newString = str.substring(0, firstLetterOfSubstring) + str.substring(firstLetterOfSubstring + lengthOfSubstring, str.length());

        System.out.println(newString);

        /*for(int i=0; i<array.length; i++){
            if(array[i].equals("http://www.xyz51.com")){

            }else{
                System.out.print(array[i]+" ");
            }
        }*/

    }
}
