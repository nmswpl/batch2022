package in.co.nmsworks.exercise2;
// Write a program using Recursion to find and print the factorial of a number.
public class FactorialUsingRecursion
{
    public static int findFactorail(int factorial)
    {
        if (factorial == 0)
        {
            return 1;
        }
        else
        {
            return factorial * findFactorail(factorial -1);
        }
    }

    public static void main(String[] args)
    {
        int factorial = 5;
        int result = findFactorail(factorial);
        System.out.println("Factorial of " + factorial + " is : " +result);
    }
}
