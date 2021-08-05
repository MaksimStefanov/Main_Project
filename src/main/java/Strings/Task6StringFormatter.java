package strings;

public class Task6StringFormatter {
    public static void main(String[] args) {
        /*%b Логическое (булево) значение аргумента
          %c Символьное представление аргумента
          %d Десятичное целое значение аргумента
          %s Строковое представление аргумента
          %f Десятичное значение с плавающей точкой
       */

        //Example 1
        //This is book
        String v = "book";
        System.out.println("This is "+v);// This is book

        //Several
        String result2 = String.format("This %s is about %s %c \n", "book", "java", '8');
        System.out.print(result2);

        //Example 2
        double x = 1000.0 / 3.0;
        System.out.println("Строка без форматирования: " + x);

        String result3 = String.format("Строка c форматированием: %.1f%n", x);
        System.out.print(result3);

        //Self study task
        //
        /* Do you believe in horoscopes?
        Составить следующую строку, используя StringFormat:
        https://24smi.org/zodiac/connect/man-libra-woman-scorpio*/
        String manZnakZodiaka = "libra";
        String womenZnakZodiaka = "scorpio";

        System.out.println("https://24smi.org/zodiac/connect/man-"+manZnakZodiaka+"-woman-"+womenZnakZodiaka);
        String result = String.format("https://24smi.org/zodiac/connect/man-%s-woman-%s",manZnakZodiaka, womenZnakZodiaka);


    }
}
