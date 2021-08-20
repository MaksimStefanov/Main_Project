package test;

public class Array {
    //Есть массив с заявленными двумя элементами. Написать исключение если код попытается
    // получить доступ к третьему элементу массива.
    public static void main(String[] args) {
        try {
            int [] array = new int[2];
            System.out.println(array[3]);

        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println( " banana " + e);
        }
    }
}


