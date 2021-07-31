package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps extends Cat {
    public Maps(String name) {
        super(name);
    }

    public static void main(String[] args) {

        String[] names = new String[]{"вася", "петя", "жорик", "петр", "клава", "лохматый", "котэ", "жора", "вася", "петя"};


        HashMap<String, Cat> map = addCats(names);


        for (Map.Entry<String, Cat> item : map.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    public static HashMap<String, Cat> addCats(String[] names) {

        HashMap<String, Cat> map1 = new HashMap();

        for (int i = 0; i < names.length; i++) {
            map1.put(names[i], new Cat(names[i]));
        }

        return map1;

    }
}



