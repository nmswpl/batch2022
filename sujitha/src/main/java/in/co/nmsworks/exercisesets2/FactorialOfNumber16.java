/*16. Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120*/
package in.co.nmsworks.exercisesets2;

public class FactorialOfNumber16 {
    public static int factorial(int number)
    {
        if(number==0)
        {
            return 1;
        }
        else {
            return (number * factorial(number - 1));
        }
    }
    public static void main(String[] args)
    {
        int number;
        int result = FactorialOfNumber16.factorial(5);
        System.out.println("factorial of number is "+result);

    }
}
