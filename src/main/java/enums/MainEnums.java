package enums;

import java.util.Arrays;
/*1) Создать enum c цветами радуги Rainbow:
● вывести все элементы Rainbow
● вывести номер слова Blue
*/
public class MainEnums {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Rainbow.values()));
        System.out.println(Rainbow.BLUE.ordinal()+1);// порядковый номер
       // System.out.println(Rainbow.BLUE.ordinal()); // номер элемента
    }
}
