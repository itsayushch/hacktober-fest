import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedScanner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the amount of data : ");
        String input = reader.readLine();
        int data = Integer.parseInt(input);

        String[] name = new String[data];
        Integer[] age = new Integer[data];

        int number = 1;

        for( int i = 0; i < data; i++ ){
            System.out.println("Please enter data to - " + number++);
            System.out.print("Name : ");
            name[i] = reader.readLine();
            System.out.print("Age : ");
            age[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("===== Result =====");
        System.out.println("| Name | Age |");
        for(int i = 0; i < data; i++) {
            System.out.print("| " + name[i] + " | ");
            System.out.println(age[i] + " |");
        }
    }
}
