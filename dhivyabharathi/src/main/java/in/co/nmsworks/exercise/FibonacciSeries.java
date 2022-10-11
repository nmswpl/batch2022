package in.co.nmsworks.exercise;
//16. Display Fibonacci Series Using for Loop
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = -1 , n2 =1 , n3 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no");
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.println("Fibonacci series : "+n3);

        }




    }
}
