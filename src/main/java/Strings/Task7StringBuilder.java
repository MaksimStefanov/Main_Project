package Strings;

public class Task7StringBuilder {
    public static void main(String[] args) {

        /**Добавление к строке
         * Чтобы что-то добавить к изменяемой строке (StringBuilder), нужно воспользоваться методом append().
         * */
        StringBuilder builder = new StringBuilder("Привет");
        builder.append("Пока");
        builder.append(123);

        /**Преобразование к стандартной строке
         * Чтобы преобразовать объект StringBuilder к строке типа String, нужно просто вызвать у него метод toString()
         * */
        StringBuilder builder1 = new StringBuilder("Привет");
        builder1.append(123);
        String result = builder1.toString();
        System.out.println(result);

        /**Как удалить символ?
         * Чтобы удалить символ в изменяемой строке, вам нужно воспользоваться методом deleteCharAt()
         * */
        StringBuilder builder2 = new StringBuilder("Привет");
        builder2.deleteCharAt(2);
        builder2.delete(2, 4);
        String result2 = builder2.toString();
        System.out.println(result2);
        System.out.println("После delete: " + builder2);

        /**Как заменить часть строки на другую?
         * Для этого есть метод replace(int begin, int end, String str)
         * */
        StringBuilder builder3 = new StringBuilder("Привет");
        builder3.replace(2, 5, "Hello!");
        String result3 = builder3.toString();
        System.out.println(result3);

        /**Как развернуть строку задом наперед?
         * Для этой операции есть специальный метод — reverse()
         * */
        String str = "Привет";
        StringBuilder builder4 = new StringBuilder(str);
        builder4.reverse();
        String result4 = builder4.toString();
        System.out.println(result4);

        /**
         *
         * */
        StringBuilder stringBuilder = new StringBuilder("Этo простой тест.");
        stringBuilder.replace(4, 11, "был");
        System.out.println(stringBuilder);

        /** equals() и hashCode()
         * Классы StringBuilder и StringBuffer не переопределяют методы equals() и hashCode().
         * Они используют реализацию класса Object
         * */
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");

        System.out.println(stringBuilder1.equals(stringBuilder2));
        System.out.println(stringBuilder1 == stringBuilder2);


    }
}
