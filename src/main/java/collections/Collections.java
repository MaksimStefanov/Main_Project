package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    /*1. Создай список слов, заполни его самостоятельно.
Модифицировать список следующим образом:
● удалять из списка строк все слова, содержащие букву "р"
● удваивать все слова содержащие букву "л".
● если слово содержит и букву "р" и букву "л", то оставить это
слово без изменений.
● с другими словами ничего не делать.
*/
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("лоза");
        list.add("роза");
        list.add("список");
        list.add("лира");
        list.add("ролы");
        list.add("привет");
        list.add("работа");
        list.add("акселератор");
        list = change(list);
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> change(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (item.contains("л") && item.contains("р")) {
                result.add(item);
            } else if (item.contains("р")) {
            } else if (item.contains("л")) {
                result.add(item);
                result.add(item);
            } else {
                result.add(item);
            }
        }
        return result;
    }

}

