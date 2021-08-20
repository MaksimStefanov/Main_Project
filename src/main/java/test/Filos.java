package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.nio.*;

import static java.nio.charset.CodingErrorAction.REPLACE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class Filos {
    public static void main(String[] args) throws IOException {
        //1.Создать проперти файл руками
        Path testFile = Files.createFile(Paths.get("src\\main\\resources\\test.properties"));
        System.out.println(Files.exists(Paths.get("src\\main\\resources\\test.properties")));
        System.out.println(testFile.getFileName());

        //2.Записать туда значение Имя_файла=имя_вашего_файла
        String filename = "src\\main\\resources\\test.properties";
        Path path = Paths.get(filename);
        String str = "test.properties = test.txt";
        Files.write(path, str.getBytes());


        //3. Считать имя_файла из проперти файла.
        Properties properties = new Properties();
        properties.load(Files.newInputStream(path));
        String value = properties.getProperty("test.properties");
        System.out.println(value);

//        System.out.println(Files.readAllLines(path));
//        for (String item:Files.readAllLines(path)) {
//            System.out.println(item);


        //4.Создать файл с именем имя_файла.
        Path testFile2 = Files.createFile(Paths.get("src\\main\\resources\\", value));
        System.out.println(Files.exists(Paths.get("src\\main\\resources\\", value)));
        System.out.println(testFile2.getFileName());

        //5 Написать туда что-то
        String fileName1 = "src\\main\\resources\\";
        Path path1 = Paths.get(fileName1, value);
        String str1 = "text";
        Files.write(path1, str1.getBytes());

        //6 Создать директорию
        Path directory = Files.createDirectory(Paths.get("src\\main\\resources\\directory"));
        System.out.println(directory.getParent());
        //7 Перестить туда созданный файл
        testFile2 = Files.move(testFile, Paths.get("src\\main\\resources\\directory", value), REPLACE_EXISTING);

    }


}
