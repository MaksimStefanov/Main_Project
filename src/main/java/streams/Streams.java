package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

int[] arr = {1,2,3,4,5};
arr = Arrays.stream(arr).filter(a -> a>2).map(a->a*10).toArray();
Arrays.stream(arr).forEach(System.out::println); //(a-> System.out.println(a))
List<Integer> listo = new ArrayList<>();
for (int i=0; i<10; i++){
    listo.add(i);
}
listo.stream().filter(a->a<5).map(a->a-1).forEach(System.out::println);
      listo =  listo.stream().filter(a->a<5).map(a->a-1).collect(Collectors.toList());
      listo.stream().forEach(System.out::println);

    }
}
