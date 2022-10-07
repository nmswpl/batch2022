package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Fibonacci Series
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range : ");
        int range = scanner.nextInt();
        int firstTerm = 0;
        int secondTerm =1;
        for(int i = 0; i < range; i ++)
        {
            System.out.print(firstTerm + " , ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
