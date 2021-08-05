package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collections {
    //add
    //remove
    //clear
    //contains
    //size
    //iterator
    //toArray
    //**************************
    //addAll
    //containsAll
    //removeAll
    //retainAll -общие эл 2х коллекций
    //ArrayList,LinkedList
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " ");
        }
    }
}
