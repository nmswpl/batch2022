package in.co.nmsworks.exercise1;
//Write a program to find Factorial of a Number Using Recursion
public class practice23
{
    public static void main(String[] args)
    {
      int no = 6;
      int fact =  factorial(no);
      System.out.println(fact);
    }
    public static int factorial(int no)
    {
        if(no >= 1)
         return no * factorial(no - 1);
        else
            return 1;
    }
}
