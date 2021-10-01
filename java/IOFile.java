//Use of scanner class object
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a;
        int b;
        double c;
        char d;
        String e;

        System.out.println("Enter the string");
        e = sc.nextLine();

        System.out.println("Enter the byte");
        a = sc.nextByte();

        System.out.println("Enter the int");
        b = sc.nextInt();

        System.out.println("Enter the double");
        c = sc.nextDouble();

        System.out.println("Enter the char");
        d = sc.next().charAt(0);

        System.out.println("string value: " + e);
        System.out.println("byte value: " + a);
        System.out.println("int value: " + b);
        System.out.println("double value: " + c);
        System.out.println("char value: " + d);
        sc.close();
    }
}
