//16. Write a program using Recursion to find and print the factorial of a number.
// For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
package in.co.nmsworks.training.excercise2;

public class Recursion {
    public static void main(String[] args)
    {
        int num =5;

        System.out.println("result is " + recursionFact(num));
    }
    public static int recursionFact(int num)
    {
        if(num == 0)
            return 1;
        else
            return num * recursionFact(num - 1);
    }

}



