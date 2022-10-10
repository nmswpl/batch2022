package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class NegativeOrPositive
{
    public static void main(String[] args)
    {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = numbers.nextInt();
        if(number<=0)
        {
            System.out.println(number + " negative");
        }
            else
            {
                System.out.println(number + " positive");
            }
        }

}
