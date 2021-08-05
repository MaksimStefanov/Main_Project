package strings;

public class Task5StringTask3 {
    public static void main(String[] args) {
        /*Task3
        Напишите метод, заменяющий в строке каждое вхождение «object-oriented programming»
        (не учитываем регистр символов) на «OOP».*/
        String oopInJava = "Object-oriented programming is a programming language model organized around" +
                " objects rather than \"actions\" and data rather than logic. object-oriented programming blabla." +
                " Object-oriented programming bla.";

        String newString = oopInJava.toLowerCase();

        String result = newString.replaceAll("object-oriented programming", "OOP");
        System.out.println(result);


        /*Task3.1.
        Напишите метод, заменяющий в строке каждое ВТОРОЕ вхождение «object-oriented programming»
        (не учитываем регистр символов) на «OOP».*/

        String[] array = oopInJava.split(" ");

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("object-oriented")//Object-oriented
                    && array[i+1].equals("programming") && (i%2 == 0) && i!=0){
                array[i] = "OOP";
                array[i+1] = "";
            }
        }

        String result2 = String.join(" ", array);
        System.out.println(result2);
    }
}
