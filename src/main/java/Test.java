public class Test extends Exception {
    public static void main(String[] args) throws ExceptionOfMine {

        // что нужно дописать чтобы при раскоментирование выброса исключения у нас не было ошибки
        try {
            throw new ExceptionOfMine();

        }
        /*catch (ExceptionOfMine)*/ finally {
            System.out.println("c");
        }
    }
}



