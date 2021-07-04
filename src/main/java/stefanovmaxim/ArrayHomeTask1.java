package stefanovmaxim;
/*1) Счастливый билет.
        Дан массив с 6 элементами типа int. Определить, является билет
        счастливым. Билет является счастливым, если сумма первых трех
        чисел сумме 4го, 5го и 6го числа.
        Числа должны быть в промежутке от 0 до 9 включительно.
        В результате вывести текст (пример):
        “Билет счастливый: true”*/


public class ArrayHomeTask1 {
    public static void main(String[] args) {

        ticket();
    }


    private static void ticket() {
        int[] massive = {1,2,3,4,5,6};
        int firstPart = massive[0] + massive[1] + massive[2];
        int secondPart = massive[3] + massive[4] + massive[5];
        if (firstPart == secondPart) {

            System.out.println("You are lucky");

        } else {
            System.out.println("Try one more time");
        }
    }
}
