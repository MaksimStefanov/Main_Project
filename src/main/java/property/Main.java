package property;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pathDestination = Paths.get("C:\\Users\\User\\Project_Hillel1\\src\\main\\java");
        Path pathOriginFile = Paths.get("C:\\Users\\User\\Project_Hillel1\\src\\main\\java\\property");

        Files.createDirectory(Paths.get(pathDestination + "\\resources"));
        String resourcesFile = "\\file.properties";

        Files.createFile(Paths.get(pathDestination + resourcesFile));
        Path file = Paths.get(pathOriginFile + resourcesFile);
//read from the file
        Properties properties = new Properties();
        properties.load(Files.newInputStream(file));

        String email = properties.getProperty("email");
        String name = properties.getProperty("name");
//print
        System.out.println(email);
        System.out.println(name);

//move
        Path from = Paths.get("C:\\Users\\User\\Project_Hillel1\\src\\main\\java\\file.properties");
        Path to = Paths.get("C:\\Users\\User\\Project_Hillel1\\src\\main\\java\\resources\\fileAfterMoving.properties");
        Files.move(from, to);
        Path writeToFile = Paths.get(String.valueOf(to));
        Files.write(writeToFile, Collections.singleton(name));
//read
        Properties properties1 = new Properties();
        properties.load(Files.newInputStream(writeToFile));
//print
        String name1 = properties1.getProperty("name");
        System.out.println(name);


    }
}
