package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> apartments = new ArrayList<>();
        apartments.add(new House(16, 250000, "Odessa", true));
        apartments.add(new House(14, 450000, "Kiev", true));
        apartments.add(new House(12, 120000, "Harkov", false));
        System.out.println("Sorted price through Comparable");
        Collections.sort(apartments);
        for (House item : apartments) {
            System.out.println(item);
        }
        System.out.println("Sorted area through Comparator");
        Collections.sort(apartments, new AreaComparator());
        for (House item : apartments) {
            System.out.println(item);
        }
    }
}