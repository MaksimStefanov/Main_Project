package Strings;

public class HomeTaskString1 {
    public static void main(String[] args) {
stringFormat("Иванов",2,"Химии");
    }

    public static void stringFormat(String a, int b,  String c) {
        System.out.println("Студент " + a +
                " получил " + b + " по " + c + ".");
        String result = String.format("Студент %s получил %d по %s.",a,b,c);
        System.out.println(result);
    }
}
