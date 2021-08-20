package Candies;
/*

1. Заполнить табличку:
        Доступно(+), недоступно(-)
                                                         private default protected public
1 Один и тот же класс-----------------------------------| +      |  +      | +   |  +
2 Подкласс, находящийся в том же пакете, что
        и суперкласс------------------------------------| -      |  +      | +   |  +
3 Класс из того же самого пакета, не
        являющийся подклассом.--------------------------| -      |  +      | +   |  +
4 Подкласс, находящийся в другом пакете.----------------| -      |  -      | +   |  +
5 Класс из другого пакета, не являющийся----------------| -      |  -      | -   |  +
        подклассом данного.
*/


public class CandyMain {
    /*2. Новогодний подарок.
    Определить иерархию конфет и прочих сладостей.
    У каждой сладости и конфеты должно быть поле int weight.
    Создать несколько объектов-конфет.
    Найти сумму всех весов сладостей .*/
    public static void main(String[] args) {
        CaramelCandy korovka = new CaramelCandy(90);
        ChocolateCandy trufell = new ChocolateCandy(52);
        Lollipop chupaChups = new Lollipop(42);
        CaramelCandy iriska = new CaramelCandy(25);
        ChocolateCandy lybimov = new ChocolateCandy(58);
        Lollipop barbariska = new Lollipop(40);
        int box = korovka.getWeight() + trufell.getWeight() + chupaChups.getWeight()
                + iriska.getWeight() + lybimov.getWeight() + barbariska.getWeight();

        // System.out.println("В подарочной упаковке: " + box + " грамм конфет");
        //----------------------------------------------------------------
        //************ homework lecture 11***************

        Candies candy = new CaramelCandy(400);
        Candies candy1 = new Lollipop(300);

        Candies candy2 = new ChocolateCandy(430);
        Candies candy3 = new Lollipop(500);

        Candies[] array = new Candies[Candies.count];

        System.out.println(array.length);


    }
}
