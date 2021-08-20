package stefanovmaxim;

public class HomeTask5 {
    public static void main(String[] args) {
        String result;
        String seasonName = "summer";
        result = (seasonName.equals("winter") || seasonName.equals("spring") || seasonName.equals("autumn")) ? "It's cold" : "It's hot";


        System.out.println(result);
    }
}


