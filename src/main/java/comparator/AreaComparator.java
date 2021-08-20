package comparator;



import java.util.Comparator;

public class AreaComparator implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        if (o1.area == o2.area){
            return 0;
        }else if(o1.area > o2.area){
            return 1;
        }else{
            return -1;
        }
    }
}