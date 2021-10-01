import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine(); 
        System.out.print("Enter the character to search for on the string: ");
        char ch = scan.next().charAt(0);
        scan.close();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch)
                count++;
        }
        System.out.println("Frequency of character '" + ch +"' in " + s + " is "+ count);
    }
}
