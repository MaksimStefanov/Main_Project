package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tests {
    //Какое исключение необходимо обработать при чтении из файла


    public static void main(String[] args) {
        File file = new File("Test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



