package in.co.nmsworks.exercise2;
//Write a program using Recursion to find and print the factorial of a number.
//For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
public class Workout16
{
    public static void main(String[] args)
    {
      int no = 5;
      int fact = factorial(no);
        System.out.println(fact);
    }
    public static int factorial(int no)
    {
        if(no>=1)
         return  no * factorial(no - 1);
        else
           return 1;

    }
}
