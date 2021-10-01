import java.util.*;  
public class Fibonacci {

    public static void main(String[] args) {

	 int n , t1 = 0, t2 = 1;
        System.out.println("Please Input your number to print Fibonacci Series");

        Scanner sc= new Scanner(System.in);   
        n= sc.nextInt();  
        System.out.println("First " + n + " terms: ");


        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
