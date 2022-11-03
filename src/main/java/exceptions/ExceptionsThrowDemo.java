package exceptions;

import java.io.IOException;

public class ExceptionsThrowDemo {

    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }


}
