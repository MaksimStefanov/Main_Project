package stefanovmaxim;

/*
1)метод имеет параметры?
- да, String s, int n
2) метод имеет возвращаемое значение?
- да, sentence
*/
public class Methods4 {
    public static String multiply(String s, int n) {
        String sentence = "";

        while (n > 0) {
            n--;
            sentence += s;
            continue;
        }
        return sentence;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Тучи", 7));
        System.out.println(multiply("Солнце"));

    }

    /*
    1)метод имеет параметры?
    - да, String s
    2) метод имеет возвращаемое значение?
    - да, sentence
    */
    public static String multiply(String s) {
        String sentence = "";
        for (int n = 5; n > 0; n--) {
            sentence += s;
        }
        return sentence;

    }
}
