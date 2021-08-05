package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    // как проверить емеил на валидность

    public static void main(String[] args) {
        String text = "maas@cdfd.ssd";
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
// в блоке текста найти украинские телефонные номера и вывести на экран

   /* public static void main(String[] args) {
        String text = "Мова значно запозичила синтаксис 0979999999із C і C++. Зокрема, взято за основу об'єктну модель С++, проте " +
                "її модифіковано. Усунуто можливіс+380660112233ть появи деяких конфліктних ситуацій, що могли виникнути через помилки " +
                "прогр45654645аміста та полегшено сам процес розробки об'єктно-орієнтованих ";

        Pattern pattern = Pattern.compile("(0|\\+380)\\d{9}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());*/
// в блоке текста найти все номера кредитных карт

   /* public static void main(String[] args) {
        String text = "Мова значно за 4441-3333-4444-5555 позичила синтаксис 09 79999999із C і C++. Зокрема, взято за основу об'єктну модель С++, проте " +
                "її 5375 2222 3333 4444модифіковано. 334 ть появи деяких конфліктних 5375222233334444 ситуацій, що могли виникнути через помилки ";

        Pattern pattern = Pattern.compile("(\\d{4}[\\s|-]?){4}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());*/

// усложним немного задание и в блоке текста найдем кредитные карточки только visa, это номер карты начинается на 4

    /*public static void main(String[] args) {
        String text = "Мова значно за 4441-3333-4444-5555 позичила синтаксис 09 79999999із C і C++. Зокрема, взято за основу об'єктну модель С++, проте " +
                "її 5375 2222 3333 4444модифіковано. 4111111144445555 ть появи деяких конфліктних 5375222233334444 ситуацій, що могли виникнути через помилки ";

        Pattern pattern = Pattern.compile("4\\d{3}[\\s|-]?(\\d{4}[\\s|-]?){3}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/


// у нас парсится страница, нам нужно узнать дату публикации новости

    /* public static void main(String[] args) {
         String text = "ЖИЗНЬ\nВ Днепре хотят перекрыть движение транспорта на косе на Красном Камне\nСоздано 03.04.2021\n\n" +
                 "В Днепре планируют перекрыть движение по косе в Новокодакском районе города, на жилмассиве Красный Камень. " +
                 "Для ограничения движения там хотят установить шлагбаум.\n\nЗапретить собираются движение транспорта на " +
                 "рекреационной территории косы в направлении острова Горелого на основании письма инспекции по вопросам " +
                 "благоустройства горсовета от 18 марта 2021 года.";
         Pattern pattern = Pattern.compile("(\\d\\d.){2}\\d{4}|(\\d\\d) [А-Яа-я]{3,8} \\d{4}");
         Matcher matcher = pattern.matcher(text);

         while (matcher.find()) {
             System.out.println(matcher.group());
 */
// еще усложним задачу теберь нам надо найти только корректные даты потому что у нас может быть такая запись 24.13.2055,
// запись идет в виде DD.MM.YYYY день, месяц, год

 /*   public static void main(String[] args) {
        String text = "ЖИЗНЬ\nВ Днепре хотят перекрыть движение транспорта на косе на Красном Камне\nСоздано 03.04.2021\n\n" +
                "В Днепре планируют перекрыть движение по косе в Новокодакском районе города, на жилмассиве Красный Камень. " +
                "Для ограничения движения там хотят установить шлагбаум.\n\nЗапретить собираются движение транспорта на " +
                "рекреационной территории косы в направлении острова Горелого на основании письма инспекции по вопросам " +
                "благоустройства горсовета от 18 марта 2021 года. Фейкодата 24.13.2055. Корректная дата2 24.12.2055";
        Pattern pattern = Pattern.compile("((0[1-9]|1[0-9]|2[0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4})|(\\d\\d [А-Яа-я]{3,8} \\d{4})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
*/
// дана последовательность из фруктов и овощей, нам надо в этой строке заменить все названия товаров стоимостью 25 USD и 3 UAH на авокадо

   /* public static void main(String[] args) {
        String string = "банан 25 UAH\n"
                + "ананас 30 UAH\n"
                + "картошка 25 USD\n"
                + "дыня 4 USD\n"
                + "яблоко 3 UAH\n"
                + "лук 25 USD";

        String result = string.replaceAll("([А-Яа-я]+)(?= (25 USD|3 UAH))", "авокадо");
        System.out.println(result);
    }*/
//Германия - вторая мировая война - в главном штабе завелись шпионы. Нужно подать руководству отчет с фамилиями кто шпион.
// Условия поиска по окончаниям русская фамилия

   /* public static void main(String[] args) {
        String string = "Иванов телеграфист \n"
                + "Кравцова связист \n"
                + "Прокопенко управляющий \n"
                + "Тендельбаум аналитик \n"
                + "Фишер кладовщик \n"
                + "Беккер повар \n"
                + "Шмидт охранник";
        String subst = "шпион";


        String regex = "(?<=(ов|ва|ко) )(([А-Яа-я]+))";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);


        String result = matcher.replaceAll(subst);

        System.out.println(result);
    }
}*/


