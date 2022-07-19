package practic;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse("123_sihTekaT_123", 4, 12)); // переворот обрезать
        System.out.println(reverseNum(123456789)); //перевернуть число
        System.out.println(reverseStr("reverse")); //перевернуть строку
        System.out.println(countOfLitters("wordword", false)); //сколько всех букв /сколько уникальных
    }

    private static String reverse(String str, int start, int end) {
        String s1 = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            s1 = chars[i] + s1;

        }
        s1 = s1.substring(start, end);
        return s1;
    }

    private static Integer reverseNum(int number) {
        String str = String.valueOf(number);
        String s1 = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            s1 = chars[i] + s1;
        }
        Integer s2 = Integer.valueOf(s1);
        return s2;
    }

    private static String reverseStr(String word) {
        String str = String.valueOf(word);
        String s1 = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            s1 = chars[i] + s1;
        }
        return s1;
    }

    private static Long countOfLitters(String word, boolean unique) {
        long a = 0;
        if (unique == false) {
            a = word.chars().count();
            return a;
        }
        if (unique == true) {
            a = word.chars().distinct().count();
            return a;
        }
        return a;
    }

}
