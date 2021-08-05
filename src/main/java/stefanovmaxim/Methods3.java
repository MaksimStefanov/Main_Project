package stefanovmaxim;
/*
1)метод имеет параметры?
- да, double yourNumber
2) метод имеет возвращаемое значение?
- да
*/
public class Methods3 {
    public static void main(String[] args) {
        double result = Methods3.addTenPercent(500);
        System.out.println(result);
    }

    public static double addTenPercent(double yourNumber) {
        double result = yourNumber + (yourNumber * 0.1);
        return result;
    }
}
