package Strings;

import java.util.Arrays;

public class Task5String {
    public static void main(String[] args) {
        //Task0. Create String
        //Self study
        String a = "";
        String b = null;
        //String c = 'A';
        String d = "A";
        char[] chars1 = {'а', 'b', 'с'};
        String str2 = new String(chars1);//"abc"
        System.out.println("str2:" + str2);

        //Длинна строки - length()
        //Распечатать последний символ строки.
        str2.length();

        //Task1. Convert to char massive
        String example1 = "Default values";
        char[] mas1 = example1.toCharArray();
        //Print all elements of massive
        for (char item : mas1) {
            System.out.println(item);
        }

        //Change "values" to "value."
        //Self study
        String str3 = "values";
        char[] array1 = str3.toCharArray();
        array1[array1.length-1] = '.'; //s
        System.out.println(Arrays.toString(array1));

        str3.replace('s', '.');
        str3.replace("es", "e.");


        //{1,3,5}
        //array[1] = 8;


        //Task2. Basic methods

        String example2 = "Cool phrase";
        //Сравнение строк: equals
        boolean result = example2.equals("Cool phras");
        System.out.println("Are two Strings equal?:" + result);

        //equalsIgnoreCase
        boolean result1 = example2.equalsIgnoreCase("cool phras");
        System.out.println("IgnoreCase: are two Strings equal?" + result1);

        //Сравнение строк: compareTo
        int result2 = example2.compareTo("Cool phras");
        System.out.println("Are two Strings equal?:" + result2);

        //Now we can compare Strings!!!
        String[] array = {
                "Для", "работы", "со", "строками", "в", "языке", "Java",
                "используются", "классы", "String", "StringBuilder", "StringBuffer"
        };

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Сравнение подстрок
        // isEmpty()
        // contains(String substring)
        // startWith(String substring), endWith(String substring)
        String s = "I like Java like like!!!";

        System.out.println("String is empty? : " + s.isEmpty());
        System.out.println("String is ends with !!! : " + s.endsWith("!!!"));
        System.out.println("String contains substring: " + s.contains(" "));

        //Other classes with string

        //charAt(int number) - get symbol by index

        //Обратный метод indexOf(String str) - get first index of substring in string
        String stry = "Funny string";//f u n n
        int sLetterIndex = stry.indexOf('s');//int number
        char letter = stry.charAt(sLetterIndex); //s
        System.out.println("S index:"+sLetterIndex);
        System.out.println("Letter with index"+sLetterIndex+" is "+letter);

        //Найти первое вхождение слова "string"
        System.out.println(stry.indexOf("string"));

        //Get substring - string
        System.out.println(stry.substring(6, stry.length() - 1));//


        //Replace symbols
        //replace() -
        //replaceFirst() -
        //replaceAll() -
        //Заменить все символы “а” на “о”.
        //Заменить все строки “like” на “love”.

        /*String s4567 = stry.replace("n", "g");
        System.out.println(s4567);
        System.out.println(stry.replaceFirst("n", "g"));
        System.out.println(stry.replaceAll("string", "story"));*/


        //toUpperCase() - Преобразуйте строку к верхнему регистру. (DDDDD)
        //toLowerCase() - Преобразуйте строку к нижнему регистру. (dddd)
        System.out.println(stry.toUpperCase());
        stry.toLowerCase();


        //Convert String to massive of Strings
        //split
        String fg = "First,Second,Third";
        String[] mas3 = fg.split(",");//
        /*for (String item : mas3) {
            System.out.println(item);
        }*/


        //Massive Strings to one String
        //join
        String.join(",", mas3);

        //Remove " " from beginning and from end of String
        String s3 = "   ffff   ";
        /*System.out.println("String after trim():" + s3.trim());*/

        //Example
        //String.valueOf()
        //Обратный метод Integer.parseInt()
        int a1 = 5;
        String s4 = String.valueOf(a1);//"5"
        //System.out.println("After valueOf() function:" + s4);
    }
}
