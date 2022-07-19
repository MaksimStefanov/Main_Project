package practic;

public class Reverse {
   /* public static void main(String []args){
        String line = "aaabccdddce";
        System.out.println( line.chars().distinct().count() );
    }*/

    /*public static void main(String []args) {
        String line = "организация объединённых наций";
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));*/

   /*public static void main(String []args) {
       String s = "hello";
       char c = s.charAt(2);
       System.out.println(c);*/

    public static void main(String[] args) {
        System.out.println(reverse("123_sihTekaT_123",4,12)); // переворот обрезать
        System.out.println(reverseNum(123456789)); //перевернуть число
        System.out.println(reverseStr("reverse")); //перевернуть строку
    }

    private static String reverse(String str,int start, int end) {
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
        Integer s2= Integer.valueOf(s1);
        return s2;}
    private static String reverseStr(String word) {
        String str = String.valueOf(word);
        String s1 = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            s1 = chars[i] + s1;
        }
        //Integer s2= Integer.valueOf(s1);
        return s1;}


}
