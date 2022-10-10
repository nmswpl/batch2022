package in.co.nmsworks.exercise1;
//Write a program to find the Sum of Natural Numbers using for loop
import java.util.Scanner;

public class practice12
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=no;i++)
        {
            sum += i;

        }
        System.out.println("SUM = "+sum);
    }
}
