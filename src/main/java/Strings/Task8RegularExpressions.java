package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8RegularExpressions {
    public static void main(String[] args) {
        String exampleTest = "This is my small example "
                + "string which I'm going to use for pattern matching.";
        System.out.println(exampleTest.matches("\\w.*"));
        String[] splitString = (exampleTest.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with tabs
        System.out.println(exampleTest.replaceAll("\\s+", "\t"));

        Pattern pattern = Pattern.compile("Java \\d+");
        Matcher matcher = pattern.matcher("Java 8, Java 7, Java , Java 11 dfghjk");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
