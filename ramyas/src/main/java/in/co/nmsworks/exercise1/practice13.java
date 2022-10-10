package in.co.nmsworks.exercise1;
//Write a program to Find Factorial of a number using for loop
import java.util.Scanner;

public class practice13
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = 1;

        for(int i=1;i<no;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+no +" = "+fact);
    }
}
