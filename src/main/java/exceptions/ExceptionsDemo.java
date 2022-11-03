package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;

public class ExceptionsDemo {

    public static void show() {

        try {
            var reader = new FileReader("hello.txt");
            System.out.println("Files opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
            System.out.println(ex.getMessage());
        }

    }

    public static void sayHello(String name) {
        //System.out.println(name.toUpperCase());
    }
}
