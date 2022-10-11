package in.co.nmsworks.exercise;
//10. Write a program to Check if a Number is Positive or Negative using if else
import java.util.Scanner;

public class PositiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Check No");
        int CheckNo = in.nextInt();

        if(CheckNo<0)
        {
            System.out.println("Given no is Negative : "+CheckNo);
        }

        else
        {
            System.out.println("Given no is Positive : "+CheckNo);
        }
    }
}
