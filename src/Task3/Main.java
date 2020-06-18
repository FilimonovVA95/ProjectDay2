package Task3;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws ArithmeticException, URISyntaxException {

        try {
            ExceptionCatching.catchMe();
        }
        catch (NullPointerException e) {

        }
        catch (FileNotFoundException e) {

        }

    }

}
