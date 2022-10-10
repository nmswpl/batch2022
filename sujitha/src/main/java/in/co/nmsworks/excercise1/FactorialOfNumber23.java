/*23. Write a program to find Factorial of a Number Using Recursion*/
package in.co.nmsworks.excercise1;

import in.co.nmsworks.exercisesets2.FactorialOfNumber16;

public class FactorialOfNumber23
{

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
        int result = FactorialOfNumber23.factorial(6);
        System.out.println("answer is "+result);
    }


}
