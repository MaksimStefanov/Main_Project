package stefanovmaxim;
// Вариант а)

/*public class HomeTask13 {
    public static void main(String[] args) {
        int cow = 4;
        for(int chicken =1; chicken<5; chicken++,cow--) {
            System.out.println("В доме есть "+chicken+" курица и "+cow+" корова");
        }
    }
}*/

// Вариант б)

/*
public class HomeTask13 {
    public static void main(String[] args) {
        int cow = 4;
        int chicken;
        String cowMultiple = "вы";
        String chickenMultiple = "цы";
        for (chicken = 1; chicken < 5; chicken++, cow--)
            if (chicken > 1 && cow > 1) {
                System.out.println("В доме есть " + chicken + " кури" + chickenMultiple + " и " + cow + " коро" + cowMultiple + "");

            } else if (chicken == 1 && cow != 1) {
                System.out.println("В доме есть " + chicken + " курица и " + cow + " коро" + cowMultiple + "");
            } else {
                System.out.println("В доме есть " + chicken + " кури" + chickenMultiple + " и " + cow + " корова");
            }


    }

}
*/

// Вариант в)

public class HomeTask13 {
    public static void main(String[] args) {
        int cow = 4;
        int summ=18;
        String cowMultiple = "вы";
        String chickenMultiple = "цы";
        for (int chicken = 1; chicken < 5; chicken++, cow--,summ-=2)
            if ( chicken > 1 && cow > 1) {
                System.out.println("В доме есть " + chicken + " кури" + chickenMultiple + " и " + cow + " коро" + cowMultiple + ". Количество ног = "+summ+"");

            } else if (chicken == 1 && cow != 1) {
                System.out.println("В доме есть " + chicken + " курица и " + cow + " коро" + cowMultiple + ". Количество ног = "+summ+"");
            } else {
                System.out.println("В доме есть " + chicken + " кури" + chickenMultiple + " и " + cow + " корова. Количество ног = "+summ+"");
            }
    }
}