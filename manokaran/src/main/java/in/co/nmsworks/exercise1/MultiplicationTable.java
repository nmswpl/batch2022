package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Multiplication Table
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which table : ");
        int number = scanner.nextInt();
        for(int i = 1; i <= 10; i ++)
        {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }
}
