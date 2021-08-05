package strings;

public class Task5StringTask1 {
    public static void main(String[] args) {
        //Task1. Count the words in text
        String str = "Please visit my website http://www.xyz51.com";

        String[] array = str.split(" ");
        System.out.println(array.length);
    }
}
