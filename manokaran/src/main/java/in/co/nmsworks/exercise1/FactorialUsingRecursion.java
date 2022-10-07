package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class FactorialUsingRecursion
{
    public static int findFactorial(int findFactorial)
    {
        if (findFactorial == 1)
        {
            return 1;
        }
        else
        {
            return findFactorial * (findFactorial(findFactorial - 1));
        }
    }

    public static void main(String[] args)
    {
        int findFactorial;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        findFactorial = scanner.nextInt();
        int result = findFactorial(findFactorial);
        System.out.println("Factorial of" + findFactorial + " is " + result);

    }
}
