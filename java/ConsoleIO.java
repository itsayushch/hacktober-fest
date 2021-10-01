import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class will read Input from Console and prints Output on Console
 */
public class ConsoleIO {

    public static void main(String[] args) throws IOException {
        BufferedReader inputReader
                = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your input: ");
        String input = inputReader.readLine();
        System.out.println("You have provided :" + input);
    }
}
