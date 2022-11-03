package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class ExceptionsDemo {

    public static void show() {

        try {
            var reader = new FileReader("hello.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("Files opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Could not read data.");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void sayHello(String name) {
        //System.out.println(name.toUpperCase());
    }
}
