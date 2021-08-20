package stefanovmaxim;
/*
1)метод имеет параметры?
- да, int salary
2) метод имеет возвращаемое значение?
- нет
*/
public class Methods5 {
    public static void main(String[] args) {
        Methods5.hackSalary(2000);
    }

    public static void hackSalary(int salary) {
        System.out.println("Твоя зарплата составляет: " + (salary + 100) + " долларов в месяц");


    }

}
