package exceptions;

import java.io.IOException;

public class ExceptionsThrowDemo {

    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }


}
