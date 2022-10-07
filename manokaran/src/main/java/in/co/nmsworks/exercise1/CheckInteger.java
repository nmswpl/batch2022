package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Check Integer is Positive Or Negative
public class CheckInteger
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int number = scanner.nextInt();
        if (number > 0)
        {
            System.out.println(number + " is Positive");
        }
        else if (number == 0)
        {
            System.out.println(number + " is Zero");
        }
        else
        {
            System.out.println(number + " is Negative");
        }
    }
}
