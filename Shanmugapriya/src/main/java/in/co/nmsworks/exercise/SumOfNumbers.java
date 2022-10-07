package in.co.nmsworks.training.program.exercise;

import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = S.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        System.out.println("Sum :"+sum);
    }
}
