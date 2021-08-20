package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams
{
    //////////////////// 1
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a С помощью StreamAPI решить ");
        list.add("следующую задачу:Найти строки");
        list.add("a С помощью StreamAPI решить ");
        list.add("которые начинаются с буквы ");
        list.add("Aперевести строки в верхний регистр");
        list.add("и вывести полученные строки");
        list.stream().filter((String x) -> x.charAt(0) == 'a').map(x -> x.toUpperCase()).forEach(System.out::println);
/////////////////// 2
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(6);
        System.out.println(list1.stream().filter(x -> x % 2 == 0).count());

//////////////// 3
        List<User> list2 = Arrays.asList(new User("Vasya",43),new User("Alesha",45),new User("Andrey",23));
        System.out.println(list2.stream().filter(x -> x.getName().charAt(0) == 'A').findFirst().get().getName());


    }
}
